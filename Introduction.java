package com.kunal.access;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        int day = 1;
        String world = "world";

        String name = "kunal Nagwanshi";
        String hobbies = "reading,running";
        int age = 25;
        Scanner in = new Scanner(System.in);
        System.out.println("My name is "+name);
        System.out.printf("I am %d years old.\n",age);
        System.out.print("My hobbies are "+hobbies);


// System.out.printf("hello %s! today is Day: %d of your Intermediate java course",world,day);
    }
}
