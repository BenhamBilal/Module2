import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String[] namen = new String[6];
//        namen[0] = "Camel";
//        namen[1] = "Redouane";
//        namen[2] = "Kays";
//        namen[3] = "Ali";
//        namen[4] = "Bayan";
//        namen[5] = "Ilyas";
//        int groote = namen.length;
//
//        for(String name : namen){
//            System.out.println(name);
//        }

//        String[] student = {"Max","Tibaut","Jeremy"};
//        System.out.println(Arrays.toString(student));

//        je krijgt onderstaande code.
//
//        int[] studentenScores = {12, 8, 13, 18, 15, 6, 12};
//        int grootte = studentenScores.length;
//
//        Schrijf een functie om de gemiddelde score te berekenen uit deze array.
//

//        int[] studentenScores = {12, 8, 13, 15, 6, 12};
//        int groote = studentenScores.length;
//        int som = 0;
//        for (int i = 0 ; i < groote; i++){
//            som += studentenScores[i];
//        }
//        int gemiddeldeScore = som / groote;
//        System.out.println(gemiddeldeScore);

//        HOW TO USE DATES AND FORMATTING !!!

//        LocalDateTime myDate = LocalDateTime.now();    /* First you take de normal current time and date without formatting patterns  */
//        System.out.println("Before formatting " + myDate );
//
//        DateTimeFormatter myFormatDateTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");  /* secondly have to set-up your patterns  using "DateTimeFormatter.ofPattern( your patterns in "" )" */
//
//        /* Finally in a String variable put your current DateTime ".format(Date Time pattern)" */
//
//        String formateDate = myDate.format(myFormatDateTime);
//        DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//        LocalDate besteldatum = LocalDate.now();
//        LocalDate leverdatum = besteldatum.plusDays(4);
//        String fromatLeverDatum = leverdatum.format(myFormatDate);
//        System.out.println(fromatLeverDatum);

//        Challenges Module 2

//        Easy ChallengesTerug naar boven
//        E1: test arrays
//        Indien je zelf iets wil invoeren kan je gebruik maken van onderstaande code.
//
//                Scanner in = new Scanner(System.in);
//        String invoer = in.nextLine();
//
//        Maak een array aan met 10 plaatsen waar je gehele getallen kan in bijhouden. Op deze array voer je vervolgens enkele bewerkingen uit.
//
//                Vul de array op zodat elke index de waarde 5 bevat
//        Pas de tweede waarde aan zodat dit nu 23 bevat
//        Probeer op de derde index de waarde 1.5 te plaatsen, lukt dit?
//                Schrijf een loop waarmee je elke waarde binnen de array kan afdrukken als “element i = waarde
        int[] getallen = new int[10];
        getallen[0] = 5;
        getallen[1] = 5;
        getallen[2] = 5;
        getallen[3] = 5;
        getallen[4] = 5;
        getallen[5] = 5;
        getallen[6] = 5;
        getallen[7] = 5;
        getallen[8] = 5;
        getallen[9] = 5;

        getallen[1] = 23;

        System.out.println(Arrays.toString(getallen));

        for(int i = 0 ; i < getallen.length ; i++){
            System.out.println(getallen[i]);
        }
        //

//        for(int getal : getallen){
//            System.out.println(getal);
//        }
    }
}