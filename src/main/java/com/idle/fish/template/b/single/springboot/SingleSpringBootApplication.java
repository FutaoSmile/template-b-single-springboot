package com.idle.fish.template.b.single.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author idle fish
 * @since 2023/11/21
 */
@ServletComponentScan("com.idle.fish.template.b.single.springboot.filter")
@SpringBootApplication
public class SingleSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SingleSpringBootApplication.class, args);
    }
}
