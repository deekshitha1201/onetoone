package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Address;

public interface Addressrepository extends JpaRepository<Address, Integer> {

}
