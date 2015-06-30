package computerspielchen.zork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kohlschreiber on 17.04.2015.
 */
public class Main {

    public static void main(String[] args) {


//      Kochrezept damit wir weiter unten was einlesen können
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Gib deinen Namen ein: ");
        String eingabe = "";

        // try heißt: versuche das zu machen was in {} steht. Wenn das schief geht (= es wird eine Exception geschmissen) dann mach das was in der Klammer nach catch steht.
        // Zusatzinfo: es gibt unterschiedliche Dinge die schief gehen können. Das wird dadurch deutlich gemacht was für eine Art von Exception geschmissen wird. Hier sagen wir im catch block:
        // wenn eine IOException geschmissen wird dann mach e.printStackStrace().
        try {
            eingabe = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Wilkommmen, "+ eingabe+ "!\n" +
                " Du bist ein Held deines Volkes und solst deine neu Land entdecken " +
                "du hast die möglichkein dich zu bewegen mit den komandos " +
                "unten " +
                "oben " +
                "rechts " +
                "links ");

        Karte karte = new Karte();

        Person person = new Person(eingabe, karte);

        while(true) {

            System.out.println("Du siehst ");

        }
    }













}




