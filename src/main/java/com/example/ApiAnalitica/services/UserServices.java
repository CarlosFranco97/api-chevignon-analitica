package com.example.ApiAnalitica.services;

import com.example.ApiAnalitica.models.User;
import com.example.ApiAnalitica.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    IUserRepository repository;

    //guardar
    public boolean saveUser(User user) throws Exception {
        try {
            User saved = this.repository.save(user);
            System.out.println("DEBUG: saved.getId() = " + saved.getId());
            return true;

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //buscar todos
    public List<User> getUsers() throws Exception{
        try{
            return this.repository.findAll();
        } catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
