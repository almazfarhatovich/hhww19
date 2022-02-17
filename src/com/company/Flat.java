package com.company;

import java.util.Arrays;

public class Flat implements Komuslug {
    private String address;
    Family[] families;

    public Flat() {
    }

    public Flat(String address, Family[] families) {
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
    public void payKom() {
        System.out.println("5000 сом коммуслуга толойт");
    }

    @Override
    public String toString() {
        return "Flat:\n" +
                "address:" + address + '\n' +
                "families:" + Arrays.toString(families);
    }
}

