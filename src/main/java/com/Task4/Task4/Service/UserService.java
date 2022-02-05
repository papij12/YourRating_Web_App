package com.Task4.Task4.Service;

import com.Task4.Task4.Entity.User;
import com.Task4.Task4.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listAll(){
        return (List<User>) userRepository.findAll();
    }
    public void save(User user){
        userRepository.save(user);
    }

    public User get(Integer id) throws UserNotFoundException {
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        }
         throw new UserNotFoundException("Did not find any users with the ID" + id);
    }

    public void delete(Integer id) throws UserNotFoundException {

        userRepository.deleteById(id);
    }
}
