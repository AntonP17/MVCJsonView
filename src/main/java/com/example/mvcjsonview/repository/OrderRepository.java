package com.example.mvcjsonview.repository;

import com.example.mvcjsonview.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}