package computerspielchen.zork;


import java.awt.*;

public class Person {
    // private heißt dass du den namen dieser Person nicht von außen siehst oder verändern kannst.
    // nur von innerhalb der Klasse
    private String name;
    private Point position;
    private Karte karte;

    // das hier ist der Konstruktor der Klasse Person. Hiermit kann man Personen bauen.
    // hier sagen wir dass wir zum bauen einer Person den Namen (vom Typ String) brauchen sowie eine Karte (vom Typ Karte)
    public Person(String name, Karte karte) {
        this.name = name;
        this.position = new Point(karte.laenge / 2, karte.hoehe / 2 );
        this.karte = karte;
    }

    public void geheNachRechts() {
        // Hier ist die Breite der Karte gespeichert: karte.laenge
        // Hier ist die Position der Person in x-Richtung gespeichert: position.x
        // x = 2 und laenge = 3 -> hier darf er nicht nach rechts!

// 3x3
//  2 0   x = 2
//        länge 3
// x = 2 && laenge = 3 -> unwahr
// x = 1 && laenge = 3 -> wahr
// x = 4 && laenge = 3 .> unwahr
        if (karte.laenge -1 > position.x) {
            position.x++;
                        //was er machen soll wenn AUSSAGE war ist
        } // das ist das Selbe wie position.y = position.y +1
   // x=0 laenge 3 -> unvahr
   // x=1 laenge 3 -> wahr
    }
    public void geheNachLinks(){
        if (position.x > 0) {
            position.x--;
        }
    //y = 1 lawnge -> 3
    }
    public void geheNachOben(){
        if (position.y +1 < karte.hoehe)
        position.y++;
    }
    public void geheNachUnten(){
        if (position.y > 0) {
            position.y--;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Karte getKarte() {
        return karte;
    }

    public void setKarte(Karte karte) {
        this.karte = karte;
    }
}