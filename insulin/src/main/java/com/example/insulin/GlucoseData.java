package com.example.insulin;

import jakarta.persistence.*;

@Entity
@Table(name = "glucose_data")
public class GlucoseData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "glucose_number")
    private Float glucoseNumber;
    
    @Column(name = "carbohydrate_number")
    private Float carbohydrateNumber;
    
    @Column(name = "dose_number")
    private Float doseNumber;
    
    @Column(name = "user_id")
    private Long userId;
    
    // Default constructor
    public GlucoseData() {
    }
    
    // Constructor with arguments
    public GlucoseData(Float glucoseNumber, Float carbohydrateNumber, Float doseNumber, Long userId) {
        this.glucoseNumber = glucoseNumber;
        this.carbohydrateNumber = carbohydrateNumber;
        this.doseNumber = doseNumber;
        this.userId = userId;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getGlucoseNumber() {
        return glucoseNumber;
    }

    public void setGlucoseNumber(Float glucoseNumber) {
        this.glucoseNumber = glucoseNumber;
    }

    public Float getCarbohydrateNumber() {
        return carbohydrateNumber;
    }

    public void setCarbohydrateNumber(Float carbohydrateNumber) {
        this.carbohydrateNumber = carbohydrateNumber;
    }

    public Float getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(Float doseNumber) {
        this.doseNumber = doseNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    // toString() method
    @Override
    public String toString() {
        return "GlucoseData{" +
                "id=" + id +
                ", glucoseNumber=" + glucoseNumber +
                ", carbohydrateNumber=" + carbohydrateNumber +
                ", doseNumber=" + doseNumber +
                ", userId=" + userId +
                '}';
    }
}
