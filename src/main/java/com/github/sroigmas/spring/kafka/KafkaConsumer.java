package com.github.sroigmas.spring.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

  /*@KafkaListener(topics = {"hobbit"}, groupId = "spring-kafka")
  public void consume(String quote) {
    System.out.println("Received: " + quote);
  }*/

  @KafkaListener(topics = {"hobbit"}, groupId = "spring-kafka")
  public void consume(ConsumerRecord<Integer, String> record) {
    System.out.println("Received: " + record.value() + " with key: " + record.key());
  }
}
