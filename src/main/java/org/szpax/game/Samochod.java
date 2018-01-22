package org.szpax.game;

public class Samochod {

    public static int liczbaSamochodow = 7;

    private String name;

    public Samochod(String myname) {
        this.name = myname;
    }

    public void go(String gdzie) {
        System.out.println(name + ": Pojechalem do " + gdzie + "!");
    }

    public String getName() {
        return name;
    }
}
