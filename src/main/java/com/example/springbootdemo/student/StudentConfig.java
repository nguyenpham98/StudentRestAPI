package com.example.springbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maria = new Student(
                                1L,
                                "maria",
                                "maria@email.com",
                                LocalDate.of(2021, Month.APRIL, 19)
                        );
            repository.saveAll(
                    List.of(maria)
            );
        };

    }
}
