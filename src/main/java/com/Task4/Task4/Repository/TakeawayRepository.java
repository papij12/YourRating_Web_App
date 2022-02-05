package com.Task4.Task4.Repository;

import com.Task4.Task4.Entity.Takeaway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TakeawayRepository extends JpaRepository<Takeaway, Integer> {

}
