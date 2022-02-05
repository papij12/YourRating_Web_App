package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.Takeaway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TakeawayRepositoryTest {
    @Autowired
    private TakeawayRepository takeawayRepository;
    @Test
    public void saveTakeaway(){
        Takeaway takeaway = new Takeaway();
        takeaway.setName("Magic Pizza");
        takeaway.setRating(5);
        takeaway.setUserId(1);
        takeawayRepository.save(takeaway);

    }
    @Test
    public void  findAllTakeaway(){
        List<Takeaway>takeawayList = takeawayRepository.findAll();
        System.out.println("list of takeaway =" + takeawayList);

    }


}