import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

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

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Geef een mail: ");
//        String userEmail = scan.nextLine();
//        if (userEmail.equals("bilal-b@live,be")){
//
//        }


//        HOW TO USE DATES AND FORMATTING !!!

//        LocalDateTime myDate = LocalDateTime.now();    /* First you take de normal current time and date without formatting patterns  */
//        System.out.println("Before formatting " + myDate );
//
//        DateTimeFormatter myFormatDateTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");  /* secondly have to set-up your patterns  using "DateTimeFormatter.ofPattern( your patterns in "" )" */
//
//        /* Finally in a String variable put your current DateTime ".format(Date Time pattern)" */
//        LocalDate datum = LocalDate.now();
//        DateTimeFormatter formatPatternTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//        String formattedDate = datum.format(formatPatternTime);
//        System.out.println(formattedDate);
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

//        E1.
//
//        Maak een array aan met 10 plaatsen waar je gehele getallen kan in bijhouden. Op deze array voer je vervolgens enkele bewerkingen uit.
//
//                Vul de array op zodat elke index de waarde 5 bevat
//        Pas de tweede waarde aan zodat dit nu 23 bevat
//        Probeer op de derde index de waarde 1.5 te plaatsen, lukt dit?
//                Schrijf een loop waarmee je elke waarde binnen de array kan afdrukken als “element i = waarde
//        int[] getallen = new int[10];
//        getallen[0] = 5;
//        getallen[1] = 5;
//        getallen[2] = 5;
//        getallen[3] = 5;
//        getallen[4] = 5;
//        getallen[5] = 5;
//        getallen[6] = 5;
//        getallen[7] = 5;
//        getallen[8] = 5;
//        getallen[9] = 5;
//
//        getallen[1] = 23;
//
//        System.out.println(Arrays.toString(getallen));
//
//        for(int i = 0 ; i < getallen.length ; i++){
//            System.out.println(getallen[i]);
//        }
        //

//        for(int getal : getallen){
//            System.out.println(getal);

//        }
//        E2: test strings
//        Maak twee Strings aan, in de eerste plaats je “the quick brown fox” en in de tweede “Jumps over the lazy dog”. Voeg beide strings samen tot een nieuwe string.
//
//        Vervang in de vorige String het woord “fox” door “cat”. Zoek hiervoor op welke functie je kan gebruiken.

//        String part1 = "the quick brown fox ";
//        String part2 = "Jumps over the lazy dog";
//        String fullZin = part1 + part2;
//        String newFullZin = fullZin.replace("fox","cat");
//        System.out.println(fullZin);
//        System.out.println(newFullZin);

//        M1: Door de hele lijst
//        Maak een array aan waar je vijf verschillende gehele getallen in plaatst. Schrijf vervolgens code uit om de gemiddelde waarde van deze getallen te berekenen.

//        int[] geheleGetallen = new int[5];
//        geheleGetallen[0] = 5;
//        geheleGetallen[1] = 6;
//        geheleGetallen[2] = 7;
//        geheleGetallen[3] = 8;
//        geheleGetallen[4] = 9;
//
//        System.out.println(Arrays.toString(geheleGetallen));
//        int som  = 0;
//        for (int getal : geheleGetallen){
//            som+= getal;
//        }
//        int grootte = geheleGetallen.length;
//        int gemiddeldegetallen = som / grootte;
//        System.out.println(gemiddeldegetallen);


//        H1: Afsprakenkalender
//        Start met het maken van een array waar je 5 datums kan in bijhouden. Vervolgens ga je deze opvullen met fictieve doktersafspraken. Voor het eerste element in de lijst neem je de datum vandaag. Elk volgend element is 15 dagen verder.
//        LocalDate[] afspraakDatums = new LocalDate[5];
//        afspraakDatums[0] = LocalDate.now();
//        System.out.println(Arrays.toString(afspraakDatums));
//        for(int i = 1; i < afspraakDatums.length;i++){
//             afspraakDatums[i] = afspraakDatums[i-1].plusDays(15);
//        }
//        System.out.println(Arrays.toString(afspraakDatums));

//        Module 3 !
//
//        E1: Een eenvoudige klasse
//        Maak een klasse Cirkel die als gegevens de straal van de cirkel en de kleur bevat. Zorg voor een aantal constructoren zodat je een Cirkel kan aanmaken zonder parameters, met slechts één          argument (straal, kleur) of met beide parameters (straal en kleur). Tenzij anders ingegeven is de straal 0 en de kleur wit. Maak (uiteraard) ook getters en setters. Zorg tenslotte voor           de volgende extra methoden:
//
//        print() om de cirkel (straal en kleur) af te printen.
//        geefOmtrek() : 2 * pi * r , met r als straal
//        geefOppervlakte() : pi * r * r
//        Voor de waarde van pi kan je

//        Cirkel cirkel1 = new Cirkel();
//        cirkel1.setKleur("blauw");
//        cirkel1.print();

//        M1:
//        Een iets minder eenvoudige klasse "
//        Maak een klasse Adres.Een object van de klasse kan de adresgegevens van een persoon bijhouden.Een adres
//        bevat minstens de volgende gegevens:
//
//        straatnaam
//        huisnummer(enkel cijfers)
//        bus
//        postcode(exact 4cijfers)
//        woonplaats
//        Denk zelf na over de meest geschikte types om bv.tekst of getallen bij te houden.
//        Zorg er voor dat je zeker een constructor hebt waar je alles aan kan meegeven.Zorg ook voor getters en setters.
//        Voeg ook nog een functie toe waarmee je alle gegevens in de console kan afdrukken.Als uitdaging voorzie je
//        ook nog een controle bij het invoeren van een postcode, dit moet uit exact 4 cijfers bestaan en anders
//        vervang je de invoer door 9999.

//        Adres adres1 = new Adres("Bergensesteenweg",493,2, 1070,"Anderlecht");
//        System.out.println(adres1.toString());
//
//
//        H1:
//        Klasse Auto
//        Maak een klasse Auto.Een auto heeft een kilometerteller, een brandstoftank met een inhoud in liter en een verbruik(aantal liter per 100km).Gebruik voor deze gegevens een double als               datatype.
//        Voorzie minstens twee constructors, één die toelaat aan alle gegevens een beginwaarde te geven en één die werkt met een aantal default
//        waarden(nieuwe auto, lege tank).Je hoeft geen bijkomende controles uit te voeren.Je mag er van uitgaan dat de gebruiker altijd realistische waarden gebruikt.
//
//        Voorzie een methode om de tank bij te vullen(altijd tot ze vol is).Voorzie een methode om een gegeven aantal km te rijden.In dit geval telt de kilometerteller altijd vooruit (ook alsje           een negatief getal ingeeft).Er wordt
//        steeds brandstof verbruikt.Hou er rekening mee dat er mogelijk te weinig brandstof kan zijn om de volledige afstand te rijden.In dat geval wordt er gereden tot de tank leeg is.Eens klaar         geeft de methode het aantal gereden km als returnwaarde.
//
//        Voorzie ook een methode om alle relevante gegevens van een Auto object af te drukken.

    }
}