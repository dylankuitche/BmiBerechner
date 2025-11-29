package bmi_bodyfat;
public class Person {
        private final double gewichtKg;
    private final double groesseMeter;
    private final String geschlecht;
    private final double tailleCm;
    private final double nackenCm;
    private final double huefteCm;

    public Person(double gewichtKg, double groesseMeter, String geschlecht,
                  double tailleCm, double nackenCm, double huefteCm) {
        this.gewichtKg = gewichtKg;
        this.groesseMeter = groesseMeter;
        this.geschlecht = geschlecht;
        this.tailleCm = tailleCm;
        this.nackenCm = nackenCm;
        this.huefteCm = huefteCm;
    }

    public double getGewichtKg() { return gewichtKg; }
    public double getGroesseMeter() { return groesseMeter; }
    public String getGeschlecht() { return geschlecht; }
    public double getTailleCm() { return tailleCm; }
    public double getNackenCm() { return nackenCm; }
    public double getHuefteCm() { return huefteCm; }
    
}
