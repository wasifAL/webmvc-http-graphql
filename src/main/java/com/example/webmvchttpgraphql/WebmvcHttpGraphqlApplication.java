package com.example.webmvchttpgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.web.WebInterceptor;
import reactor.core.publisher.Mono;

import java.time.Duration;

@SpringBootApplication
public class WebmvcHttpGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebmvcHttpGraphqlApplication.class, args);
    }

    @Bean
    public WebInterceptor interceptor(){
        return (webInput, chain) ->{
            return Mono.delay(Duration.ZERO).flatMap(aLong -> chain.next(webInput));
        };
    }
}
