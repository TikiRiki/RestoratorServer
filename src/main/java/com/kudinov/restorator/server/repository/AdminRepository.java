package com.kudinov.restorator.server.repository;

import com.kudinov.restorator.server.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
}
