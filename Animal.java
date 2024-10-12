package com.Assignment_4.demo;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalID;

    @Column(nullable = false)
    private String name;

    private String scientificName;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String habitat;

    private String description;

    public Animal(int animalID, String name, String scientificName, String species, String habitat, String description) {
        this.animalID = animalID;
        this.name = name;
        this.scientificName = scientificName;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
    }

    public Animal() {
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID() {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName() {
        this.scientificName = scientificName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies() {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat() {
        this.habitat = habitat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
    }
}
