package com.learn.prod_api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Jane = new Student(
                    "Jane",
                    "Jane@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 10),
                    21
            );
            Student Doe = new Student(
                    "Doe",
                    "Doe@gmail.com",
                    LocalDate.of(1994, Month.JULY, 10),
                    30
            );
            repository.saveAll(
                    List.of(Jane, Doe)
            );
        };
    }
}
