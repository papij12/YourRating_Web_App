package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Integer>{

 //  public Long countById(Integer id);
}

