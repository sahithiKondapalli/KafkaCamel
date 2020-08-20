package com.camel.kafka.dynamic.routing;

import com.camel.kafka.dynamic.routing.processor.TampaProcessor;
import com.camel.kafka.dynamic.routing.properties.RoutingProperties;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PayloadRoute {

    @Component
    public static class Message extends RouteBuilder {

        @Autowired
        private RoutingProperties routingProperties;

        @Autowired
        private TampaProcessor tampaProcessor;

        @Override
        public void configure() {
            from(String.format(routingProperties.getKafkaUrl(), routingProperties.getProducerTopic(), routingProperties.getBootstrapServers()))
                    .choice()
                    .when((xpath(routingProperties.getPredicateLondon())))
                    .to(String.format(routingProperties.getKafkaUrl(), routingProperties.getConsumerTopic1(), routingProperties.getBootstrapServers()))
                    .when(xpath(routingProperties.getPredicateTampa())).process(tampaProcessor).
                    to(String.format(routingProperties.getKafkaUrl(), routingProperties.getConsumerTopic2(), routingProperties.getBootstrapServers()))
                    .end();
        }


    }
}