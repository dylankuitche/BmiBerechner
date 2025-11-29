package bmi_bodyfat;

public class BmiBerechner {
        public static double berechneBMI(Person p) {
        return p.getGewichtKg() /
                (p.getGroesseMeter() * p.getGroesseMeter());
    }

    public static String bmiKategorie(double bmi) {
        if (bmi < 18.5) return "Untergewicht";
        if (bmi < 25)   return "Normalgewicht";
        if (bmi < 30)   return "Übergewicht";
        return "Adipositas";
    }
}
