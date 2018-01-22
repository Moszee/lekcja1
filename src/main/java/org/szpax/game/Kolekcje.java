package org.szpax.game;

//public/private/protected/() - tzw modyfikatory dostepu https://4programmers.net/Java/Podstawy_Javy#modyfikatory-dostepu
public class Kolekcje {

    private int liczbaWywolan;

    public static void main(String[] args) {
        Samochod testowy = new Samochod("Alfred");
        testowy.go("krakowa");
    }

    private static void printArray(String[] test) {
        for(String s : test) {
            System.out.println("s: " + s);
        }
    }
}
