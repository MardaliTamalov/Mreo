package com.example.clientdps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class ClientDpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientDpsApplication.class, args);
    }

}
