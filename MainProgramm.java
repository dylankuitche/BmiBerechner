package bmi_bodyfat;

import javax.swing.*;
import java.awt.*;

public class MainProgramm {

    public static void main(String[] args) {

        boolean cliModus = false;
        for (String a : args) {
            if (a.equals("--cli")) cliModus = true;
        }

        if (cliModus) {
            starteCLI();
        } else {
            starteGUI();
        }
    }

    public static void starteCLI() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Gewicht (kg): ");
        double gewicht = sc.nextDouble();

        System.out.println("Größe (m): ");
        double groesse = sc.nextDouble();

        System.out.println("Geschlecht (M/F): ");
        String geschlecht = sc.next();

        System.out.println("Taillenumfang (cm): ");
        double taille = sc.nextDouble();

        System.out.println("Nackenumfang (cm): ");
        double nacken = sc.nextDouble();

        double huefte = 0;
        if (geschlecht.equalsIgnoreCase("F")) {
            System.out.println("Hüftumfang (cm): ");
            huefte = sc.nextDouble();
        
        }

        Person p = new Person(gewicht, groesse, geschlecht, taille, nacken, huefte);

        double bmi = BmiBerechner.berechneBMI(p);
        double kf  = KoerperfettBerechner.berechneKoerperfett(p);

        System.out.println("\n=== ERGEBNISSE ===");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.printf("Kategorie: %s\n", BmiBerechner.bmiKategorie(bmi));
        System.out.printf("Körperfettanteil: %.2f%%\n", kf);

        sc.close();
    }

    public static void starteGUI() {
        JFrame fenster = new JFrame("BMI & Körperfett Rechner");
        fenster.setSize(420, 420);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(9, 2));

        JTextField gewicht = new JTextField();
        JTextField groesse = new JTextField();
        JTextField geschlecht = new JTextField();
        JTextField taille = new JTextField();
        JTextField nacken = new JTextField();
        JTextField huefte = new JTextField();

        JLabel ausgabe = new JLabel("Ergebnisse werden hier angezeigt...");

        JButton berechnen = new JButton("Berechnen");

        panel.add(new JLabel("Gewicht (kg):"));
        panel.add(gewicht);

        panel.add(new JLabel("Größe (m):"));
        panel.add(groesse);

        panel.add(new JLabel("Geschlecht (M/F):"));
        panel.add(geschlecht);

        panel.add(new JLabel("Taille (cm):"));
        panel.add(taille);

        panel.add(new JLabel("Nacken (cm):"));
        panel.add(nacken);

        panel.add(new JLabel("Hüfte (cm, nur F):"));
        panel.add(huefte);

        panel.add(berechnen);
        panel.add(ausgabe);

        berechnen.addActionListener(e -> {
            try {
                Person p = new Person(
                        Double.parseDouble(gewicht.getText()),
                        Double.parseDouble(groesse.getText()),
                        geschlecht.getText(),
                        Double.parseDouble(taille.getText()),
                        Double.parseDouble(nacken.getText()),
                        huefte.getText().isEmpty() ? 0 : Double.parseDouble(huefte.getText())
                );

                double bmi = BmiBerechner.berechneBMI(p);
                double kf = KoerperfettBerechner.berechneKoerperfett(p);

                ausgabe.setText("BMI: " + String.format("%.2f", bmi)
                        + " | Körperfett: " + String.format("%.2f", kf) + "%");

            } catch (Exception ex) {
                ausgabe.setText("Ungültige Eingabe.");
            }
        });

        fenster.add(panel);
        fenster.setVisible(true);
    }
}
