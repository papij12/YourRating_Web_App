package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.Bistro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BistroRepository extends CrudRepository<Bistro,Integer> {
}
