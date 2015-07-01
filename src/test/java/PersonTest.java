import computerspielchen.zork.Karte;
import computerspielchen.zork.Main;
import computerspielchen.zork.Person;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testGeheNachRechts() {
        Person david = new Person("name", new Karte());
        david.setPosition(new Point(1,1));

        david.geheNachRechts();

        assertEquals(david.getPosition().x, 2);
        assertEquals(david.getPosition().y, 1);
    }
    @Test
    public void testGeheNachLinks(){
        Person caro = new Person ("name", new Karte());
        caro.setPosition(new Point(2,2));

        caro.geheNachLinks();

        assertEquals(caro.getPosition().x,1 );
        assertEquals(caro.getPosition().y,2 );
    }
    @Test
    public void testGeheNachOben(){
        Person papa = new Person ("name", new Karte());
        papa.setPosition(new Point(0, 0));

        papa.geheNachOben();

        assertEquals(papa.getPosition().x,0 );
        assertEquals(papa.getPosition().y,1 );
    }
    @Test
    public void testGeheNachUnten(){
        Person mama = new Person ("name", new Karte());
        mama.setPosition(new Point(3, 3));

        mama.geheNachUnten();

        assertEquals(mama.getPosition().x,3 );
        assertEquals(mama.getPosition().y,2 );
    }
    @Test
    public void testGeheNachLinksAmRand(){
        Person caro = new Person ("name", new Karte());
        caro.setPosition(new Point(0,2));

        caro.geheNachLinks();

        assertEquals(caro.getPosition().x,0 );
        assertEquals(caro.getPosition().y,2 );
    }
    @Test
    public void testGeheNachUntenAmRand(){
        Person caro = new Person ("name", new Karte());
        caro.setPosition(new Point(1,0));

        caro.geheNachUnten();

        assertEquals(caro.getPosition().x,1 );
        assertEquals(caro.getPosition().y,0 );
    }

    // timeOut = 5000 heißt dass der Test nach 5 sekunden fertig sein sollte.
    // damit schau ich dass wir nicht ewig in der endlosschleife hängen sonder das programm sich wirklich beendet
    // wenn wir "ende" eintippen


    // du sollst jetzt in der main in der schleife immer eine zeile lesen und schauen ob "ende" geschrieben wird. und in dem fall soll das Programm beendet werden.
    // das Programm kann man mit dem Befehl "return" beenden.
    @Test(timeOut = 5000)
    public void testEnde() {
        String eingabe = "Bran\r\n" +
                        "ende\r\n";

        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(eingabe.getBytes()));
            Main.main(null);
        } finally {
            System.setIn(stdin);
        }
    }
}
