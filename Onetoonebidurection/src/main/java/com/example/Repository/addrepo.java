package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Addresses;

public interface addrepo extends JpaRepository<Addresses, Long> {

}
