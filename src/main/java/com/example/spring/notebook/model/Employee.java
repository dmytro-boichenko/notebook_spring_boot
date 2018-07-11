package com.example.spring.notebook.model;

import java.util.Date;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String notes;


    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public int getEmployeeId(){
        return employeeId;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


}
