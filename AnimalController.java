package com.Assignment_4.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ReqestMapping("/animals")

public class AnimalController {

    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }

    @GetMapping("/{animalID}")
    public Animal getOneAnimal(@PathVariable int animalID) {
        return service.getAnimalByID(animalID);
    }

    @GetMapping("/{species}")
    public Animal getOneAnimal(@PathVariable String species) {
        return service.getAnimalBySpecies(species);
    }

    @PostMapping("/new")
    public List<Animal> addNewAnimal(@RequestBody Animal animal) {
        service.addNewAnimal(animal);
        return service.getAllAnimals();
    }

    @PutMapping("/update/{animalID}")
    public Animal updateAnimal(@PathVariable int animalID, @RequestBody Animal animal) {
        service.updateAnimal(animalID, animal);
        return service.getAnimalByID(animalID);
    }

    @DeleteMapping("/delete/{animalID}")
    public List<Animal> deleteAnimalByID(@PathVariable int animalID) {
        service.deleteAnimalByID(animalID);
        return service.getAllAnimals();
    }
}
