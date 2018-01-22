package org.szpax.game;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MagicznySwiatTest {

    public static final String JEDEN = "jedn";
    public static final String DWA = "dwa";

    @Test
    public void dzialaj() throws Exception {
        MagicznySwiat swiat = new MagicznySwiat(new FabrykaSamochodowTest());

        Samochod[] dzialaj = swiat.dzialaj(JEDEN, DWA);

        assertThat(dzialaj[0].getName(), equalTo(JEDEN));
        assertThat(dzialaj[1].getName(), equalTo(DWA));
    }

    private class FabrykaSamochodowTest extends FabrykaSamochodow {

        @Override
        public Samochod utworzSamochod(String name) {
            return new Samochod(name);
        }
    }

}