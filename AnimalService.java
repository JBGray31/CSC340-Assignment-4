package com.Assignment_4.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalByID(int animalID) {
        return animalRepository.findByID(animalID).orElse(null);
    }

    public Animal getAnimalBySpecies(String species) {
        return animalRepository.findBySpecies(species).orElse(null);
    }

    public void addNewAnimal(Animal animal) {
        animalRepository.save(Animal);
    }

    public void updateAnimal(int animalID, Animal animal) {
        Animal existing = getAnimalByID( int animalID);
        existing.setName(animal.getName());
        existing.setAnimalID(animal.getAnimalID());
        existing.setSpecies(animal.getSpecies());
        existing.setScientificName(animal.getScientificName());
        existing.setHabitat(animal.getHabitat());
        existing.setDescription(animal.getDescription());

        animalRepository.save(existing);
    }

    public void deleteAnimalByID(int animalID) {
        animalRepository.deleteByID(animalID);
    }

}
