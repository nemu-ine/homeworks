package io.codelex.oop.parcels;

public class Main {

    public static void main(String[] args) {

        Parcel parcel = new Parcel(50, 60, 70, 14, true);
        System.out.println(parcel.validate());
        System.out.println(parcel.validate(50, 60, 70, 16, true));

    }

}
