package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.Restaurants;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantsRepository extends CrudRepository<Restaurants, Integer> {}
