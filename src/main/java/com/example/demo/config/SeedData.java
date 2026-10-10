package com.example.demo.config;

import com.example.demo.entity.Donor;
import com.example.demo.repository.DonorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeedData {
    @Bean
    CommandLineRunner seedDonors(DonorRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Donor("Aarav Sharma", "O+", "Delhi", "AS", true));
                repository.save(new Donor("Priya Verma", "B+", "Noida", "PV", true));
                repository.save(new Donor("Rahul Singh", "A+", "Ghaziabad", "RS", true));
                repository.save(new Donor("Meera Gupta", "AB+", "Delhi", "MG", true));
                repository.save(new Donor("Kabir Khan", "O-", "Noida", "KK", true));
            }
        };
    }
}
