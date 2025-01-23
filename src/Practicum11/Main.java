package Practicum11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de naam van het bestand: ");
        String locationPrefix = "src/Practicum11/";
        String locatie;
        Path path;
        List<String> alleRegels;
        try {
            locatie = scanner.nextLine();
            path = Path.of(locationPrefix + locatie + ".txt");
            alleRegels = Files.readAllLines(path);
        } catch (NoSuchFileException e) {
            System.out.println("Bestand is niet gevonden.");
            return;
        }

        // Schrijven naar bestand
        System.out.println("Geef de bestemmingsbestandsnaam: ");
        String bestemming = scanner.nextLine();
        Path bestemmingPath = Path.of(locationPrefix + bestemming + ".txt");
        BufferedWriter out = Files.newBufferedWriter(bestemmingPath);

        // Waarde van 1 dollar in Eurocenten vragen en controleren
        System.out.println("Geef de waarde van 1 dollar in Eurocenten: ");
        double eurocent;
        try {
            eurocent = scanner.nextDouble();
            if (eurocent <= 0) {
                System.out.println("De waarde van 1 dollar in Eurocenten moet groter zijn dan 0.");
            }
        } catch (Exception e) {
            System.out.println("De waarde van 1 dollar in Eurocenten moet een getal zijn.");
            return;
        }

        // Variabelen aanmaken om het (mogelijk) een stuk efficienter te maken.
        double price;
        double euro;
        String[] splitsen;

        // Regel voor regel in bestand plaatsen
        for (String regel : alleRegels) {
            splitsen = regel.split(" : ");
            price = Double.parseDouble(splitsen[1]);
            euro = dollarToEuro(price, eurocent);
            out.write(splitsen[0] + " : " + euro + "\n");
        }
        out.close();

    }

    private static double dollarToEuro(double dollar, double eurocent) {
        return dollar * eurocent / 100.0;
    }
}
