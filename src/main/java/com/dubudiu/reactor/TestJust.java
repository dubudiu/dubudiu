package com.dubudiu.reactor;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class TestJust {

    @Test
    public void createAFlux_just(){
        Flux<String> fruitFlux = Flux.just("Apple","Orange",
        "Grape","Banana","Strawberry");
    }
}
