package com.company;

public class Country {
    private String city;
    private String address;

    public Country(String city, String address) {
        this.city = city;
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}


