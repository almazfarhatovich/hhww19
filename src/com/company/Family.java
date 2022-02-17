package com.company;

public class Family {
    private String name;
    private int number;

    public Family() {
    }
    public Family(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Family:\n" +
                "name:" + name + '\n' +
                "number:" + number + " адам жашайт";
    }
}

