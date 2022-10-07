package com.github.sroigmas.spring.kafka.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

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

  /*@Bean
  public Map<String, Object> consumerProperties() {
    return Map.of(
        ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092",
        ConsumerConfig.GROUP_ID_CONFIG, "spring-ccloud",
        ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false,
        ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 15000,
        ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class,
        ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
  }

  @Bean
  public ConsumerFactory<String, String> consumerFactory() {
    return new DefaultKafkaConsumerFactory<>(consumerProperties());
  }*/
}
