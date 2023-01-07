import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        System.out.println("Anzahl der Messwerte angeben");
        int anzahlMesswerte = myscan.nextInt();

        System.out.println("Bitte Normalwert");
        double normal = myscan.nextDouble();

        System.out.println("Bitte Toleranz angeben");
        double toleranz = myscan.nextDouble();

        double[] werte = new double[anzahlMesswerte];
        double[] messfehler = new double[werte.length];

        for (int i = 0; i < anzahlMesswerte; i++) {
            System.out.println((i + 1) + ". Wert eingeben");
            werte[i] = myscan.nextDouble();
        }
        System.out.println("Gemessene Werte" + Arrays.toString(werte));
        int z = 0;

//
//        for (int i = 0; i < werte.length; i++) {
//            if (werte[i] <= (normal + toleranz) && werte[i] >= (normal - toleranz)) {
//                messfehler[z] = werte[i];
//                z++;
//            }


        // Enhanced For Schleife
        for (double v : werte) {
            if (v <= (normal + toleranz) && v >= (normal - toleranz)) {
                messfehler[z] = v;
                z++;
            }


        }
        System.out.println("Gemessene Werte" + Arrays.toString(werte));
        System.out.println("Fehlerhafte Werte" + Arrays.toString(messfehler));

    }
}