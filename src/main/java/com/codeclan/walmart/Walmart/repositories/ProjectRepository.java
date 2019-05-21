package com.codeclan.walmart.Walmart.repositories;

import com.codeclan.walmart.Walmart.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
