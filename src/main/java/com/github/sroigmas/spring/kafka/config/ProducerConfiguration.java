package com.github.sroigmas.spring.kafka.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfiguration {

  /*@Bean
  public ProducerFactory<String, String> producerFactory() {
    return new DefaultKafkaProducerFactory<>(
        Map.of(
            ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092",
            ProducerConfig.RETRIES_CONFIG, 0,
            ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432,
            ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class,
            ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class
        ));
  }

  @Bean
  public KafkaTemplate<String, String> kafkaTemplate() {
    return new KafkaTemplate<>(producerFactory());
  }*/
}
