package com.example.clientmreo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientMreoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientMreoApplication.class, args);
    }

}
