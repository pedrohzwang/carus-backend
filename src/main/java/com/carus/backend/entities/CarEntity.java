package com.carus.backend.entities;

import com.carus.backend.enums.ECategory;
import com.carus.backend.enums.EFuel;
import com.carus.backend.enums.EGear;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "car")
@Data
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @Column(columnDefinition = "BIT(1)")
    private boolean active = true;

    @Column(length = 50)
    private String brand;

    @Column(length = 80)
    private String model;

    @Column(length = 50)
    @Enumerated(EnumType.STRING)
    private ECategory category;

    @Column
    private String description;

    @Column(columnDefinition = "INT(2)")
    private Byte doors;

    @Column(length = 50)
    @Enumerated(EnumType.STRING)
    private EFuel fuel;

    @Column(length = 50)
    @Enumerated(EnumType.STRING)
    private EGear gearShift;

    @Column(columnDefinition = "DECIMAL(10,8)")
    private BigDecimal latitude;

    @Column(columnDefinition = "DECIMAL(10,8)")
    private BigDecimal longitude;

    @Column(length = 50)
    private String plate;

    @Column(columnDefinition = "DECIMAL(6,2)")
    private Float price;

    @Column(columnDefinition = "INT(2)")
    private Byte seats;

    @Column(columnDefinition = "INT(5)")
    private Short trunk;

    @Column(columnDefinition = "INT(5)")
    private Short year;
}
