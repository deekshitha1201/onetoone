package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
