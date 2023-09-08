//package com.example.springgateway
//
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//
//@Configuration
//class Router {
//
//    @Bean
//    fun customRouteLocator(builder: RouteLocatorBuilder)
//    = builder.routes()
//        .route("path_route", { r -> r.path("/get") }
//        .uri("http://15.164.233.188"))
//}