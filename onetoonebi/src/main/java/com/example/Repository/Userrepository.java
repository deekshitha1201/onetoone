package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;

public interface Userrepository extends JpaRepository<User, Integer>{

}
