package com.kudinov.restorator.server.repository;

import com.kudinov.restorator.server.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
