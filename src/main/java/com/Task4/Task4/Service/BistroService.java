package com.Task4.Task4.Service;

import com.Task4.Task4.Entity.Bistro;
import com.Task4.Task4.Repository.BistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BistroService {
    @Autowired
    private BistroRepository bistroRepository;

    public List<Bistro> listAll(){
        return (List<Bistro>) bistroRepository.findAll();
    }
    public void save(Bistro bistro) {bistroRepository.save(bistro);}
    public Bistro get(Integer id) throws BistroNotFoundExpection {
        Optional<Bistro> bistro = bistroRepository.findById(id);
        if(bistro.isPresent()){
            return bistro.get();
        }
        throw new BistroNotFoundExpection("Did not find any users with the ID" + id);
    }
}
