package com.Task4.Task4.Service;

import com.Task4.Task4.Entity.Bistro;
import com.Task4.Task4.Repository.BistroRepository;
import com.Task4.Task4.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BistroService {
    @Autowired
    private BistroRepository bistroRepository;

    public List<Bistro> listAll(){
        return (List<Bistro>) bistroRepository.findAll();
    }

}
