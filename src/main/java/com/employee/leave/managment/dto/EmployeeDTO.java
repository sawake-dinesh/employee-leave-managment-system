package com.employee.leave.managment.dto;

import javax.validation.constraints.NotBlank;

public class EmployeeDTO {

        int id;

        String firstName;

        String lastName;
        long mobileNumber;
        double salary;
        String currentAddress;
        String permanentAddress;
        double aaddharNumber;
        double bankAccountNumber;
        String bloodGroup;
        String emailId;

        public EmployeeDTO() {
            super();

        }

        public EmployeeDTO(int id, String firstName, String lastName, long mobileNumber, double salary,
                           String currentAddress, String permanentAddress, double addharNumber, double bankAccoutNumber,
                           String bloodGroup, String emailId) {
            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.mobileNumber = mobileNumber;
            this.salary = salary;
            this.currentAddress = currentAddress;
            this.permanentAddress = permanentAddress;
            this.aaddharNumber = aaddharNumber;
            this.bankAccountNumber = bankAccountNumber;
            this.bloodGroup = bloodGroup;
            this.emailId = emailId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
         return lastName;
     }

        public void setLastName(String lastName) {
         this.lastName = lastName;
     }

        public long getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(long mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getCurrentAddress() {
            return currentAddress;
        }

        public void setCurrentAddress(String currentAddress) {
            this.currentAddress = currentAddress;
        }

        public String getPermanentAddress() {
            return permanentAddress;
        }

        public void setPermanentAddress(String permanentAddress) {
            this.permanentAddress = permanentAddress;
        }

        public double getaddharNumber() {
            return aaddharNumber;
        }

        public void setaddharNumber(double aaddharNumber) {
            this.aaddharNumber = aaddharNumber;
        }

        public double getBankAccountNumber() {
            return bankAccountNumber;
        }

        public void setBankAccountNumber(double bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
        }

        public String getBloodGroup() {
            return bloodGroup;
        }

        public void setBloodGroup(String bloodGroup) {
            this.bloodGroup = bloodGroup;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        @Override
        public String toString() {
            return "EmployeeEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
                    + mobileNumber + ", salary=" + salary + ", currentAddress=" + currentAddress + ", permanentAddress="
                    + permanentAddress + ", aaddharNumber=" + aaddharNumber + ", bankAccountNumber=" + bankAccountNumber
                    + ", bloodGroup=" + bloodGroup + ", emailId=" + emailId + "]";
        }




    }


