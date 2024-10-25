package com.ust.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("book_service", r -> r.path("/books/**")
                        .uri("lb://book_service")) // Load balanced URI
                .route("author_service", r -> r.path("/authors/**")
                        .uri("lb://author_service")) // Load balanced URI
                .route("auth_service", r -> r.path("/auth/**")
                        .uri("lb://authentication_service")) // Load balanced URI
                .build();
    }
}