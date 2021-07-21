package com.employee.leave.managment.dao;

import com.employee.leave.managment.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import java.util.List;


public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {
    //@Override
    public class DaoImpl {

        public List<EmployeeEntity> getAllEmployees() {
            EntityManager manager = null;
            List<EmployeeEntity> employees = manager.createNamedQuery("getAllEmployees", EmployeeEntity.class)
                    .getResultList();
            return employees;
        }
    }

}
