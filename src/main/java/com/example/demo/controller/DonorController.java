package com.example.demo.controller;

import com.example.demo.entity.Donor;
import com.example.demo.repository.DonorRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/donors")
public class DonorController {
    private final DonorRepository donorRepository;
    public DonorController(DonorRepository donorRepository) { this.donorRepository = donorRepository; }

    @GetMapping
    public List<Donor> getDonors(@RequestParam(required = false) String city,
                                 @RequestParam(required = false) String bloodGroup) {
        boolean hasCity = city != null && !city.isBlank();
        boolean hasGroup = bloodGroup != null && !bloodGroup.isBlank();
        if (hasCity && hasGroup) return donorRepository.findByAvailableTrueAndBloodGroupIgnoreCaseAndCityContainingIgnoreCase(bloodGroup.trim(), city.trim());
        if (hasGroup) return donorRepository.findByAvailableTrueAndBloodGroupIgnoreCase(bloodGroup.trim());
        if (hasCity) return donorRepository.findByAvailableTrueAndCityContainingIgnoreCase(city.trim());
        return donorRepository.findByAvailableTrue();
    }
}
