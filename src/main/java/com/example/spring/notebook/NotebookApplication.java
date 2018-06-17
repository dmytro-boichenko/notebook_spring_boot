package com.example.spring.notebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotebookApplication {

    private final static Logger LOG = LoggerFactory.getLogger(NotebookApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NotebookApplication.class, args);
    }
}
