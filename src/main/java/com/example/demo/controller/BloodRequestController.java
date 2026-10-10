package com.example.demo.controller;

import com.example.demo.entity.BloodRequest;
import com.example.demo.repository.BloodRequestRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/requests")
public class BloodRequestController {
    private static final List<String> BLOOD_GROUPS = List.of("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-");
    private static final List<String> URGENCIES = List.of("Emergency", "Within 24 hours", "Planned");
    private final BloodRequestRepository repository;
    public BloodRequestController(BloodRequestRepository repository) { this.repository = repository; }

    public record CreateBloodRequest(
        @NotBlank @Size(max=100) String patientName,
        @NotBlank String bloodGroup,
        @NotBlank @Size(max=100) String city,
        @NotNull @Min(1) @Max(4) Integer units,
        @NotBlank String urgency,
        @NotBlank @Pattern(regexp="[0-9]{10}", message="Contact number must contain exactly 10 digits") String contactNumber
    ) {}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BloodRequest create(@Valid @RequestBody CreateBloodRequest input) {
        if (!BLOOD_GROUPS.contains(input.bloodGroup())) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid blood group");
        if (!URGENCIES.contains(input.urgency())) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid urgency");
        return repository.save(new BloodRequest(input.patientName().trim(), input.bloodGroup(), input.city().trim(), input.units(), input.urgency(), input.contactNumber()));
    }

    // For local demonstration only. Do not expose request contact details publicly in a production deployment.
    @GetMapping
    public List<BloodRequest> getRequests() { return repository.findAll(); }

    @GetMapping("/count")
    public Map<String, Long> countRequests() { return Map.of("count", repository.count()); }
}
