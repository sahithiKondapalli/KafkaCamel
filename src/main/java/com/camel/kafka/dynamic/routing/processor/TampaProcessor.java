package com.camel.kafka.dynamic.routing.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class TampaProcessor  implements Processor {

    @Override
    public void process(Exchange exchange) {
        String payload = exchange.getIn().getBody(String.class);
        exchange.getIn().setBody(payload.replace("Tampa","TAMPA"));
    }
}
