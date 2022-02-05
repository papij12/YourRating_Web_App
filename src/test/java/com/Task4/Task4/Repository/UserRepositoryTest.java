package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUser(){
        User user = new User();
        user.setNames("Papy");
        user.setSurname("J2");
        userRepository.save(user);
    }
   // @Test
  //  public void printUser(){
    //    List<User>userList = userRepository.findAll();
     //   System.out.println("list of user =" + userList);
   // }

   // @Test
    //public void printUserByNames(){
      //  List<User>users = userRepository.findByNames("Papy");
        //System.out.println("users = " + users);
    //}
}