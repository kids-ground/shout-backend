package com.rokwonk.shout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ShoutBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoutBackendApplication.class, args);
    }

}
