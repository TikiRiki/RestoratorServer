package com.kudinov.restorator.server.repository;

import com.kudinov.restorator.server.entity.Waiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaiterRepository extends JpaRepository<Waiter, Integer> {
}
