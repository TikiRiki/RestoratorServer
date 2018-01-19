package com.kudinov.restorator.server.repository;

import com.kudinov.restorator.server.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
}
