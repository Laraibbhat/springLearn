package org.laraib.mavenlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SpringBootApplication
//@Configuration
//@ComponentScan
public class MavenLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenLearnApplication.class, args);

    }

}
