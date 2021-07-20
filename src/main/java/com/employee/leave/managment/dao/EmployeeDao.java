package com.employee.leave.managment.dao;

import com.employee.leave.managment.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {

}
