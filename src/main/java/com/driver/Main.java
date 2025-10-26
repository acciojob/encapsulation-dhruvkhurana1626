package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r1 = new RWOnly();
        //r1.name = "dhruv";
        //not able to access name direclty bcz name variable is prvate and can only be accessed inside the same class
        //now lets use getter and setters to do so
        r1.setName("dhruv");
        System.out.print(r1.getName());
    }
}

