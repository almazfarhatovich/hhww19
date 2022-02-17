package com.company;

import java.util.Arrays;

public class Hotel implements Arenda {
    private String address;
    Family[] families;

    public Hotel() {
    }

    public Hotel(String address, Family[] families) {
        this.address = address;
        this.families = families;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Family[] getFamilies() {
        return families;
    }

    public void setFamilies(Family[] families) {
        this.families = families;
    }

    @Override
    public void payArenda() {
        System.out.println("1000 сом кунуно толойт");
    }

    @Override
    public String toString() {
        return "Hotel:\n" +
                "address:" + address + '\n' +
                "families:" + Arrays.toString(families);
    }
}