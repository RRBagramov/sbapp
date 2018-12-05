package ru.ivmiit.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "ru.ivmiit")
public class SbappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbappApplication.class, args);
    }
}
