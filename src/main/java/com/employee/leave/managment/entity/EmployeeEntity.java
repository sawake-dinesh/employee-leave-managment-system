package com.employee.leave.managment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "employee")

public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NotBlank(message = "FirstName is mandatory")
    String firstName;

    @NotBlank(message = "LastName is mandatory")
    String lastName;

    @NotBlank(message = "MobileNumber is mandatory")
    long mobileNumber;

    //@NotBlank(message = "Salary is mandatory")
    double salary;

    @NotBlank(message = "CurrentAddress is mandatory")
    String currentAddress;

    //@NotBlank(message = "PermanentAddress is mandatory")
    String permanentAddress;

    //@NotBlank(message = "aaddhar is mandatory")
    double aaddharNumber;


    //@NotBlank(message = "BankAccountNo is mandatory")
    double bankAccountNumber;

    //@NotBlank(message = "Bloodgroup is mandatory")
    String bloodGroup;

    @NotBlank(message = "emailId is mandatory")
    String emailId;


    public EmployeeEntity() {
        super();

    }

    public EmployeeEntity(int id, String firstName, String lastName, long mobileNumber, double salary,
                          String currentAddress, String permanentAddress, double aaddharNumber, double bankAccountNumber,
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

    public double getaaddharNumber() {
        return aaddharNumber;
    }

    public void setaaddharNumber(double aaddharNumber) {
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



