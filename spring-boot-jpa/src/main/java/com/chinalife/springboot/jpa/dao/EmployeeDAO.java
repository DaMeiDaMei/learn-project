package com.chinalife.springboot.jpa.dao;

import com.chinalife.springboot.jpa.eo.EmployeeEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeEO, Integer> {
}
