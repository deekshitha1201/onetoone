package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Order;

public interface Orderrepository extends JpaRepository<Order, Integer> {

}
