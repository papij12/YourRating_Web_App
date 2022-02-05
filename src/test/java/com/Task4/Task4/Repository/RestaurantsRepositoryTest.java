package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.Restaurants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RestaurantsRepositoryTest {
    @Autowired
private RestaurantsRepository restaurantsRepository;
    // A test for adding Restaurants to the database
@Test
    public void saveRestaurants(){
    Restaurants restaurants = new Restaurants();
    restaurants.setName("Chateaux");
    restaurants.setRating(5);
    restaurants.setUserId(1);
restaurantsRepository.save(restaurants);

}
@Test
    public void printAllRestaurants(){
    List<Restaurants>restaurantsList = (List<Restaurants>) restaurantsRepository.findAll();
    System.out.println("RestaurantsList= "+restaurantsList);
}
}