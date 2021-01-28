package com.example.space;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface SpaceShipRepository extends CrudRepository<SpaceShip, Integer> {
}
