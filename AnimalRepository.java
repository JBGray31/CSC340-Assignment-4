package com.Assignment_4.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository  extends JpaRepository<Animal, Integer> {

@Query(nativeQuery = true)
List <Animal> getAnimalsByName(String name);

}
