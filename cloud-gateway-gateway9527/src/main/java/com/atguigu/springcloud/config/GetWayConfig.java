package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 邢立伟20165939
 * @create 2020/3/26 - 15:41
 */
@Configuration
public class GetWayConfig {
    @Bean
    public RouteLocator customRoutelocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",r->r.path("/guonei")
                .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
