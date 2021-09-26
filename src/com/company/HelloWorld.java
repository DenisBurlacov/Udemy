package com.company;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world !!");
        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123_456_789_976L;

        float myFloatValue = 23.56F;
        double myDoubleValue = 56.35D;

        double sum = a + b + c + myLongValue + myDoubleValue + myFloatValue;
        System.out.println("sum = " + sum);

        short someShort = b;
        int someInt = someShort;

        someShort = (short) someInt;

        someInt = (int) myLongValue;

        System.out.println("someShort = " + someInt);
        System.out.println("someShort = " + someShort);

        double someLongToDouble = myLongValue;
        System.out.println("someLongToDouble = " + someLongToDouble);
    }
}
