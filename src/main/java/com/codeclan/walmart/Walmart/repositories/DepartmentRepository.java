package com.codeclan.walmart.Walmart.repositories;

import com.codeclan.walmart.Walmart.models.Department;
import com.codeclan.walmart.Walmart.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
