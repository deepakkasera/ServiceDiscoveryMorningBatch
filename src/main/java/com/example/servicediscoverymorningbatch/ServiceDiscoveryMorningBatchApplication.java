package com.example.servicediscoverymorningbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryMorningBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryMorningBatchApplication.class, args);
    }

}
