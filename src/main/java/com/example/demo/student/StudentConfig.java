package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student shubham =  new Student(
                    "Shubham",
                    "shubham120499@gmail.com",
                    LocalDate.of(1999, Month.APRIL,12)
            );

            Student alex =  new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2003, Month.APRIL,12)
            );

            Student rishi =  new Student(
                    "Rishi",
                    "rishi@gmail.com",
                    LocalDate.of(1993, Month.JUNE,28)
            );

            studentRepository.saveAll(
                    List.of(shubham,alex,rishi)
            );
        };
    }
}
