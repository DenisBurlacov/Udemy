package com.oop;

public class Dog {
    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;
    private String size;

    public void setName(String dogsName) {
        this.name = dogsName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average")
                || size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one on this: Big, Average, Small");
        }
    }
    public String getName() {
        return name;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign " + paws + " paws for a dog");
            System.out.println("Correct number is 4");
        }

    }

    public int getPaws() {
        return paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("\"User tried to assign \"" + tail + "\" paws for a dog\"");
            System.out.println("\"Correct number is 1\"");
        }

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void barks() {
        if (size.equalsIgnoreCase("Big")) {
            System.out.println("Wof-Wof");
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Gav-Gav");
        } else {
            System.out.println("Tiaf-Tiaf");
        }

    }

    public void bite() {

    }
}
