package com.company;

public class SwitchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = "Monday";
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("First working day");
                break;
            case "tuesday":
                System.out.println("Second working day");
                break;
            case "wednesday":
                System.out.println("Third working day");
                break;
            case "thursday":
                System.out.println("Fourth working day");
                break;
            case "friday":
                System.out.println("Fifth working day");
                break;
            default:
                System.out.println("Holidays");
        }
    }
}
