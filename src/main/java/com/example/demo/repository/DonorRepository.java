package com.example.demo.repository;

import com.example.demo.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByAvailableTrueAndBloodGroupIgnoreCaseAndCityContainingIgnoreCase(String bloodGroup, String city);
    List<Donor> findByAvailableTrueAndBloodGroupIgnoreCase(String bloodGroup);
    List<Donor> findByAvailableTrueAndCityContainingIgnoreCase(String city);
    List<Donor> findByAvailableTrue();
}
