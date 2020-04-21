package com.test_000805099;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        Error myObject = new Error(myArray);
        System.out.println(myArray.length);
    }
}
