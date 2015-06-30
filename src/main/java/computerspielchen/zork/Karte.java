package computerspielchen.zork;

import java.awt.*;

/**
 * Created by Kohlschreiber on 17.04.2015.
 */
public class Karte {

    String[][] umgebung;
    public final int laenge = 3;
    public final int hoehe = 3;

    // KOnstruktor
    public Karte() {
        umgebung = new String[laenge][hoehe];

        for (int laengenIterator = 0; laengenIterator < laenge; laengenIterator++) {
            for (int hoehenIterator = 0; hoehenIterator < hoehe; hoehenIterator++) {
                umgebung[laengenIterator][hoehenIterator] = "Wald";
            }
        }


    }

    public String wasIstHier(Point punkt) {
        return umgebung[punkt.x][punkt.y];
    }
}
