package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "blood_requests")
public class BloodRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String patientName;
    @Column(nullable = false) private String bloodGroup;
    @Column(nullable = false) private String city;
    @Column(nullable = false) private Integer units;
    @Column(nullable = false) private String urgency;
    @Column(nullable = false) private String contactNumber;
    @Column(nullable = false) private String status = "PENDING";
    @Column(nullable = false) private LocalDateTime createdAt;

    protected BloodRequest() {}
    public BloodRequest(String patientName, String bloodGroup, String city, Integer units, String urgency, String contactNumber) {
        this.patientName = patientName; this.bloodGroup = bloodGroup; this.city = city; this.units = units;
        this.urgency = urgency; this.contactNumber = contactNumber; this.status = "PENDING"; this.createdAt = LocalDateTime.now();
    }
    @PrePersist void onCreate() { if (createdAt == null) createdAt = LocalDateTime.now(); if (status == null) status = "PENDING"; }
    public Long getId() { return id; }
    public String getPatientName() { return patientName; }
    public String getBloodGroup() { return bloodGroup; }
    public String getCity() { return city; }
    public Integer getUnits() { return units; }
    public String getUrgency() { return urgency; }
    public String getContactNumber() { return contactNumber; }
    public String getStatus() { return status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
