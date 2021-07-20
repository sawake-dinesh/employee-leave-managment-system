package com.employee.leave.managment.assembler;


import com.employee.leave.managment.dto.EmployeeDTO;
import com.employee.leave.managment.entity.EmployeeEntity;

public class EmployeeAssembler {


        public EmployeeDTO entityToDTO(EmployeeEntity employeeEntity)
        {


            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setFirstName(employeeEntity.getFirstName());
            employeeDTO.setLastName(employeeEntity.getLastName());
            employeeDTO.setMobileNumber(employeeEntity.getMobileNumber());
            employeeDTO.setSalary(employeeEntity.getSalary());
            employeeDTO.setCurrentAddress(employeeEntity.getCurrentAddress());
            employeeDTO.setPermanentAddress(employeeEntity.getPermanentAddress());
            employeeDTO.setBloodGroup(employeeEntity.getBloodGroup());
            return employeeDTO;
        }

        public EmployeeEntity dtoToEntity(EmployeeDTO employeeDTO)
        {
            EmployeeEntity employeeEntity = new EmployeeEntity();
            employeeEntity.setFirstName(employeeDTO.getFirstName());
            employeeEntity.setLastName(employeeDTO.getLastName());
            employeeEntity.setMobileNumber(employeeDTO.getMobileNumber());
            employeeEntity.setSalary(employeeDTO.getSalary());
            employeeEntity.setCurrentAddress(employeeDTO.getCurrentAddress());
            employeeEntity.setPermanentAddress(employeeDTO.getPermanentAddress());
            employeeEntity.setBloodGroup(employeeDTO.getBloodGroup());
            return employeeEntity;
        }



    }



