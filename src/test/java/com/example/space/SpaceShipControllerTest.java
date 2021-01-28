package com.example.space;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class SpaceShipControllerTest {

    @Inject
    SpaceShipRepository spaceShipRepository;

    void createSome(){
        spaceShipRepository.save(new SpaceShip(null, "Round", "Mike", 99));
        spaceShipRepository.save(new SpaceShip(null, "Pyramid", "Mike", 88));
    }

    @Test
    void gimme() {
        createSome();
        Iterable<SpaceShip> all = spaceShipRepository.findAll();
        all.forEach(System.out::println);
    }
}