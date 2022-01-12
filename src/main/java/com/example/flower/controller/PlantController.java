package com.example.flower.controller;

import com.example.flower.dto.PlantDTO;
import com.example.flower.entity.Plant;
import com.example.flower.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plant")
public class PlantController {
    @Autowired
    private PlantService plantService;

    public PlantDTO getPlantDTO(String name){
        Plant plant = plantService.getPlantByName(name);
        return null;
    }

    public Plant getFilteredPlant(String name){
        return plantService.getPlantByName(name);
    }
}
