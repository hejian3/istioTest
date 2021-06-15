package com.hj.provider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ProviderController {

    @GetMapping("/hello/{name}")
    public Mono<String> hello(@PathVariable("name") String name) {
        return Mono.just("hello " + name);
    }
}
