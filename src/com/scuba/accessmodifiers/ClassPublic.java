package com.scuba.accessmodifiers;
 class Animall {
    public int legCount;
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}
public class ClassPublic {
    public static void main( String[] args ) {
        Animall animal = new Animall();
        animal.legCount = 4;
        animal.display();
    }
}