package com.camel.kafka.dynamic.routing.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "camel.springboot")
@Component
public class RoutingProperties {

    private String predicateLondon;

    private String producerTopic;

    private String consumerTopic1;

    private String consumerTopic2;

    private String predicateTampa;

    private String bootstrapServers;

    public String getKafkaUrl() {
        return kafkaUrl;
    }

    public void setKafkaUrl(String kafkaUrl) {
        this.kafkaUrl = kafkaUrl;
    }

    private String kafkaUrl;

     public String getPredicateLondon() {
        return predicateLondon;
    }

    public String getPredicateTampa() {
        return predicateTampa;
    }

    public void setPredicateTampa(String predicateTampa) {
        this.predicateTampa = predicateTampa;
    }

    public void setPredicateLondon(String predicateLondon) {
        this.predicateLondon = predicateLondon;
    }

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public String getProducerTopic() {
        return producerTopic;
    }

    public void setProducerTopic(String producerTopic) {
        this.producerTopic = producerTopic;
    }

    public String getConsumerTopic1() {
        return consumerTopic1;
    }

    public void setConsumerTopic1(String consumerTopic1) {
        this.consumerTopic1 = consumerTopic1;
    }

    public String getConsumerTopic2() {
        return consumerTopic2;
    }

    public void setConsumerTopic2(String consumerTopic2) {
        this.consumerTopic2 = consumerTopic2;
    }

}
