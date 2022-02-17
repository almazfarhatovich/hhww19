package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Family family1 = new Family("Janybekovy", 5);
        Family family2 = new Family("Almaz", 1);
        Family family3 = new Family("Almaz and Sister", 2);

        Family[] families = {family1};
        Family[] families1 = {family2};
        Family[] families2 = {family3};

        Flat flat = new Flat("Гагарина 139ж", families);
        System.out.println(flat);
        flat.payKom();

        Obshaga obshaga = new Obshaga("Малдыбаева 14", families1);
        System.out.println(obshaga);
        obshaga.payArenda();

        Hotel hotel = new Hotel("Магистральная 15", families2);
        System.out.println(hotel);
        hotel.payArenda();
    }
}

