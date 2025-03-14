package org.example.ordermanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.example.ordermanagementapp")
public class OrderManagementAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderManagementAppApplication.class, args);
    }

}
