package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "donors")
public class Donor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String name;
    @Column(nullable = false, name = "blood_group") private String bloodGroup;
    @Column(nullable = false) private String city;
    @Column(nullable = false) private String initials;
    @Column(nullable = false) private boolean available = true;

    protected Donor() {}
    public Donor(String name, String bloodGroup, String city, String initials, boolean available) {
        this.name = name; this.bloodGroup = bloodGroup; this.city = city; this.initials = initials; this.available = available;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getBloodGroup() { return bloodGroup; }
    public String getCity() { return city; }
    public String getInitials() { return initials; }
    public boolean isAvailable() { return available; }
}
