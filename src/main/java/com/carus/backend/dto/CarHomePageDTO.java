package com.carus.backend.dto;

import com.carus.backend.entities.CarEntity;
import com.carus.backend.enums.EFuel;
import com.carus.backend.enums.EGear;
import lombok.Data;

@Data
public class CarHomePageDTO {

    private String uuid;

    private String brand;

    private String model;

    private EFuel fuel;

    private EGear gearShift;

    private Float price;

    private Short year;

    public CarHomePageDTO(CarEntity entity) {
        this.uuid = entity.getUuid();
        this.brand = entity.getBrand();
        this.model = entity.getModel();
        this.fuel = entity.getFuel();
        this.gearShift = entity.getGearShift();
        this.price = entity.getPrice();
        this.year = entity.getYear();
    }
}
