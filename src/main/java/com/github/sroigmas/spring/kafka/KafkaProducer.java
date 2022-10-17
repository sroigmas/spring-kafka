package com.github.sroigmas.spring.kafka;

import com.github.javafaker.Faker;
import com.github.sroigmas.avro.Hobbit;
import java.time.Duration;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class KafkaProducer {

  private final KafkaTemplate<Integer, Hobbit> template;

  Faker faker;

  @EventListener(ApplicationStartedEvent.class)
  public void generate() {
    faker = Faker.instance();

    final Flux<Long> interval = Flux.interval(Duration.ofMillis(1000L));
    final Flux<String> quotes = Flux.fromStream(Stream.generate(() -> faker.hobbit().quote()));

    Flux.zip(interval, quotes)
        .map(it -> template.send("hobbit-avro", faker.random().nextInt(42), new Hobbit(it.getT2())))
        .blockLast();
  }
}
