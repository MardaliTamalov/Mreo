package com.example.clientinsurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class ClientInsuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientInsuranceApplication.class, args);
    }

}
