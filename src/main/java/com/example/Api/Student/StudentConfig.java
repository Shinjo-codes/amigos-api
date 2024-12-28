package com.example.Api.Student;

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
            Student tunde = new Student(
                    "tunde",
                    "tunde.man@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,23)
            );
            Student jude = new Student(
                    "Jude",
                    "jude.man@gmail.com",
                    LocalDate.of(1997, Month.JANUARY,23)
            );
            Student mariam = new Student(
                    "Mariam",
                    "mariam.man@gmail.com",
                    LocalDate.of(2002, Month.JANUARY,13)
            );
            Student ali = new Student(
                    "Ali",
                    "ali.man@gmail.com",
                    LocalDate.of(2003, Month.JANUARY,3)
            );

            repository.saveAll(
                    List.of(tunde, jude, mariam, ali)
            );

        };
    }
}
