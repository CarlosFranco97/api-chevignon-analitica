package com.example.ApiAnalitica.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 15, nullable = false)
    private String password;

    @Column
    private LocalDate dateBirth;

    public User(){

    }

    public User(Integer id, String name, String password, LocalDate dateBirth) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.dateBirth = dateBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }
}
