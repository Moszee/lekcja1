package org.szpax.game;

public class MagicznySwiat {

    FabrykaSamochodow fabrykaSamochodow;

    public MagicznySwiat(FabrykaSamochodow fabrykaSamochodow) {
        this.fabrykaSamochodow = fabrykaSamochodow;
    }

    public Samochod[] dzialaj(String name1, String name2) {
        Samochod pierwszy = fabrykaSamochodow.utworzSamochod(name1);
        Samochod drugi = fabrykaSamochodow.utworzSamochod(name2);
        return new Samochod[] {pierwszy, drugi};
    }

}
