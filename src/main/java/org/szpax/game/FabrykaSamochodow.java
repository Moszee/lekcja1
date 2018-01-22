package org.szpax.game;

public class FabrykaSamochodow {

    public Samochod utworzSamochod(String name) {
        return new Samochod("samochod: " + name);
    }

}
