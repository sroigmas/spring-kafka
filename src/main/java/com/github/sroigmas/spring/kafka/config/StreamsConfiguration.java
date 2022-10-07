package com.github.sroigmas.spring.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class StreamsConfiguration {

  /*@Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
  public KafkaStreamsConfiguration streamsConfiguration() {
    return new KafkaStreamsConfiguration(Map.of(
        StreamsConfig.APPLICATION_ID_CONFIG, "testStreams",
        StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092",
        StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.Integer().getClass().getName(),
        StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName(),
        StreamsConfig.DEFAULT_TIMESTAMP_EXTRACTOR_CLASS_CONFIG,
        WallclockTimestampExtractor.class.getName()
    ));
  }*/

  @Bean
  public NewTopic counts() {
    return TopicBuilder.name("streams-wordcount-output")
        .partitions(6)
        .replicas(3)
        .build();
  }
}
