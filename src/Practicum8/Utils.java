package Practicum8;

public class Utils {
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314, 3));
        System.out.println(Utils.euroBedrag(3.11314, 4));
        System.out.println(Utils.euroBedrag(3.11134, 0));
    }

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        counter++;
        return String.format("€%." + precisie + "f", bedrag);
    }

    public static int getCounter() {
        return counter;
    }
}
