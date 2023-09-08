//package com.example.springgateway;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class CustomRouter {
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("account-server", r -> r.path("/account/test")
//                        .uri("http://15.164.233.188"))
//
//                .route("post-server", r -> r.path("/post/**")
//                        .uri("http://13.209.35.205"))
//
//                .build();
//    }
//}
