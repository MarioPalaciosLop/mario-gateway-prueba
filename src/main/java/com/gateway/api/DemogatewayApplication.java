package com.gateway.api;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemogatewayApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
        		// microservices olivares
            .route("empleados_route", r -> r.path("/api/empleados/**")
                .uri("https://f880-132-184-129-91.ngrok.io"))
         // microservices antonio
            .route("compras_route", r -> r.path("/api/carritoCompra/**")
                .uri("https://ec9c-170-81-241-210.ngrok.io"))
         // microservices marito
            .route("proveedores_route", r -> r.path("/api/grupos-proveedores/**")
                .uri("https://bc93-38-25-4-47.ngrok-free.app"))/*
         // microservices olivares
            .route("productos_route", r -> r.path("/api/productos/**")
                .uri("${serv_productoss}"))
         // microservices olivares
            .route("usuarios_route", r -> r.path("/api/usuarios/**")
                .uri("${serv_usuarios}"))*/
            .build();
    }
}
