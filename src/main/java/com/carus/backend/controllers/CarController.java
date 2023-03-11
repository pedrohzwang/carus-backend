package com.carus.backend.controllers;

import com.carus.backend.dto.CarHomePageDTO;
import com.carus.backend.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<Page<CarHomePageDTO>> findAllHomePage(Pageable pageable) {
        return ResponseEntity.ok(carService.findAllPaged(pageable));
    }
}
