package com.company;

public class Methotds {
    public static void main(String[] args) {
        printMessage("Denys");
        int square = calcRectangleSquare(5, 10);
        int rectangleSquare = calcSquare(10);
        int sumOfSquare = square + rectangleSquare;
        System.out.println("square = " + square);
        System.out.println("rectangleSquare = " + rectangleSquare);
        System.out.println("rectangleSquare + square = " + sumOfSquare);

        String str1 = "I like coffee";
        System.out.println("str1.toUpperCase() = " + str1.toUpperCase());
        System.out.println("str1.toUpperCase() = " + str1.toLowerCase());

        String string2 = str1;
        String str3 = "I like coffee !!!";
        String substring = str3.substring(0, 12);
        boolean b = str1 == substring;

        System.out.println("b = " + b);
        System.out.println("str3.substring(0) = " + substring);

        boolean like = str1.startsWith("I like");
        System.out.println("like = " + like);
        System.out.println("str3 = " + str3.indexOf("!!!"));

    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!");
    }

    static int calcRectangleSquare(int length, int height) {
        int square = length * height;
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }
}
