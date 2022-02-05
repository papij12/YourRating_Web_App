package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.Bistro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BistroRepositoryTest {
    @Autowired
    private  BistroRepository bistroRepository;
    @Test
    public void saveBistro(){
        Bistro bistro = new Bistro();
        bistro.setName("test kebab");
        bistro.setRating(5);
        bistro.setUserId(4);
        bistroRepository.save(bistro);
    }
@Test
    public  void printAllBistro(){
    List<Bistro> bistroList= (List<Bistro>) bistroRepository.findAll();
    System.out.println("Bistro list= " + bistroList);
}

}