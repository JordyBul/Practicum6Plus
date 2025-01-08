package Practicum8;

public class Main {

    public static void main(String[] args) {

        Bedrijfsinventaris bedrijfsinventaris = new Bedrijfsinventaris("Bedrijf", 4900);
        Auto auto = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto3 = new Auto("Opel Astra", 43995.00, 2017, "4-MCV-94");
        Fiets fiets = new Fiets("Fiets", 500, 2020, 123456);
        Fiets fiets2 = new Fiets("Fiets", 500, 2020, 123456);
        Fiets fiets3 = new Fiets("Driewieler", 999, 2022, 987654);
        Computer computer = new Computer("Computer", "73-16-CE-46-8H-17", 2000, 2021);
        Computer computer2 = new Computer("Computer", "73-16-CE-46-8H-17", 2000, 2021);
        Computer computer3 = new Computer("Laptop", "88-75-PO-17-6Y-91", 1500, 2020);

        bedrijfsinventaris.schafAan(auto);
        bedrijfsinventaris.schafAan(auto2);
        bedrijfsinventaris.schafAan(auto3);
        bedrijfsinventaris.schafAan(fiets);
        bedrijfsinventaris.schafAan(fiets2);
        bedrijfsinventaris.schafAan(fiets3);
        bedrijfsinventaris.schafAan(computer);
        bedrijfsinventaris.schafAan(computer2);
        bedrijfsinventaris.schafAan(computer3);

        System.out.println("\nAangeschafte producten:\n");
        System.out.println(bedrijfsinventaris);
    }
}
