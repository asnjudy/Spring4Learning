package com.sample.bean;

public class Address {

    private String contury;
    private String city;

    public String getContury() {
        return contury;
    }

    public void setContury(String contury) {
        this.contury = contury;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + "] {" +
                "contury='" + contury + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
