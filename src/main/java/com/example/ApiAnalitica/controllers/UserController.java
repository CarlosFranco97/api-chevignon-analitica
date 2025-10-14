package com.example.ApiAnalitica.controllers;

import com.example.ApiAnalitica.models.User;
import com.example.ApiAnalitica.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServices services;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user){
        try {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } catch (Exception error) {
           return new ResponseEntity<>("Error al crear el usuario" + error, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<?> getUsers(){
        try {
            return new ResponseEntity<>(this.services.getUsers(), HttpStatus.OK);
        } catch (Exception error) {
            return new ResponseEntity<>("Error al obtener todos los usuarios" + error, HttpStatus.BAD_REQUEST);
        }
    }

}
