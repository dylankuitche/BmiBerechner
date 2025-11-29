package bmi_bodyfat;

public class KoerperfettBerechner {
       public static double berechneKoerperfett(Person p) {
        double taille = p.getTailleCm();
        double nacken = p.getNackenCm();
        double groesse = p.getGroesseMeter() * 100;
        String geschlecht = p.getGeschlecht().toUpperCase();

        if (geschlecht.equals("M")) {
            return 495 / (1.0324 - 0.19077 * Math.log10(taille - nacken)
                    + 0.15456 * Math.log10(groesse)) - 450;
        } else {
            double huefte = p.getHuefteCm();
            return 495 / (1.29579 - 0.35004 * Math.log10(taille + huefte - nacken)
                    + 0.22100 * Math.log10(groesse)) - 450;
        }
    }
}
