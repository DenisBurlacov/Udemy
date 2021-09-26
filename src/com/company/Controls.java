package com.company;

public class Controls {
    public static void main(String[] args) {
        int i = 10;

        {
            int k = 15;
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }

        int testScore = 60;
        System.out.println("You have got");
        if (testScore >= 90) {
            System.out.println("an Excellent");
        } else if (testScore >= 75) {
            System.out.println("a Good");
        } else if (testScore >= 60) {
            System.out.println("a Satisfactory");
        } else {
            System.out.println("a bad ");
        }
        System.out.println("mark");
    }
}
