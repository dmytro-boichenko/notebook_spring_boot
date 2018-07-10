package com.example.spring.notebook.request;

import javax.validation.constraints.NotNull;

public class CustomerRequest {

    @NotNull
    private String name;
    @NotNull
    private String contactName;
    @NotNull
    private String address;
    @NotNull
    private String city;
    @NotNull
    private String postalCode;
    @NotNull
    private String country;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
