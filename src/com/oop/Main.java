package com.oop;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog();
        lab.setPaws(5);
        lab.setTail(2);
        lab.setName("Charly");
        lab.setBreed("Lab");

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");

        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Lab has " + lab.getPaws() + " paws");
    }
}
