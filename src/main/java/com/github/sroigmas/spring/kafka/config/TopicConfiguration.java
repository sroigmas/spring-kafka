package com.github.sroigmas.spring.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

  /*@Bean
  public KafkaAdmin kafkaAdmin() {
    return new KafkaAdmin(Map.of(
        AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"
    ));
  }*/

  @Bean
  public NewTopic hobbit2() {
    return TopicBuilder.name("hobbit2")
        .partitions(10)
        .replicas(3)
        //.compact()
        //.config(TopicConfig.COMPRESSION_TYPE_CONFIG, "zstd")
        .build();
  }

  @Bean
  public NewTopic hobbitAvro() {
    return TopicBuilder.name("hobbit-avro")
        .partitions(10)
        .replicas(3)
        .build();
  }
}
