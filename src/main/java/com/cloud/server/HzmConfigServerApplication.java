package com.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HzmConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzmConfigServerApplication.class, args);
    }
}
