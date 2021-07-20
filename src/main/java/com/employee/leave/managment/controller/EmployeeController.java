package com.employee.leave.managment.controller;

import com.employee.leave.managment.dao.EmployeeDao;
import com.employee.leave.managment.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Validated

@RequestMapping("/lms/v1")


public class EmployeeController {

    @Autowired
    EmployeeDao EmployeeRepository;

    public class TestController {

        @RequestMapping(value = "/employee", method = RequestMethod.GET)
        public EmployeeEntity firstPage() {

            EmployeeEntity emp = new EmployeeEntity();
            emp.setFirstName("dinesh");
            emp.setLastName("sawake");
            emp.setId(1);
            emp.setSalary(3000);


            return emp;
        }

        /*
            private final EmployeeDao EmployeeRepository;

            public EmployeeController(EmployeeDao employeeRepository) {
                this.EmployeeRepository = employeeRepository;
            }

            @PostMapping
            public ResponseEntity<String> addEmployee(@RequestBody @Valid EmployeeEntity employee) {
                EmployeeRepository.save(employee);
                return ResponseEntity.ok("User data is valid");
            }
        */
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler(MethodArgumentNotValidException.class)
        public Map<String, String> handleValidationExceptions(
                MethodArgumentNotValidException ex) {
            Map<String, String> errors = new HashMap<>();
            ex.getBindingResult().getAllErrors().forEach((error) -> {
                String fieldName = ((FieldError) error).getField();
                String errorMessage = error.getDefaultMessage();
                errors.put(fieldName, errorMessage);
            });
            return errors;
        }


        @GetMapping("/get")
        public List<EmployeeEntity> getemployee() {
            return (List<EmployeeEntity>) EmployeeRepository.findAll();

        }

        @PostMapping("/post")
        public ResponseEntity.BodyBuilder postemployee(@Valid @RequestBody EmployeeEntity employee) {
            EmployeeRepository.save(employee);
            return ResponseEntity.badRequest();
        }

        @PutMapping("/put")
        public EmployeeEntity updateemployee(@RequestBody @Valid EmployeeEntity employee) {
            return EmployeeRepository.save(employee);
        }

        @DeleteMapping("/delete")
        public String deleteemployee(@RequestBody @Valid EmployeeEntity employee) {
            EmployeeRepository.deleteById(employee.getId());
            return "Employee deleted successfully !";
        }

    }
}



