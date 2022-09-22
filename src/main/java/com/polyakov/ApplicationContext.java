package com.polyakov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationContext implements CommandLineRunner {

    public ApplicationContext(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class, args);
    }

    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public void run(String... args) {
    }
}

