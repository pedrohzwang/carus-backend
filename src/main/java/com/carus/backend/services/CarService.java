package com.carus.backend.services;

import com.carus.backend.dto.CarHomePageDTO;
import com.carus.backend.entities.CarEntity;
import com.carus.backend.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Page<CarHomePageDTO> findAllPaged(Pageable pageable) {
        Page<CarEntity> cars = carRepository.findAll(pageable);
        return cars.map(car -> new CarHomePageDTO(car));
    }
}
