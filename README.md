# BmiBerechner
Parfait Dylan — je te prépare **un README professionnel**, clair, propre, prêt à être copié-collé dans ton GitHub.
Tu n’as rien à faire, je te livre un document nickel.

---

# ✅ **README.md – BMI & Körperfett Rechner (Java GUI Projekt)**

````md
# 🧮 BMI & Körperfett Rechner – Java Swing Projekt

Eine eigenständige Java-Anwendung mit grafischer Benutzeroberfläche (GUI), die den **Body Mass Index (BMI)** und den **Körperfettanteil** berechnet.  
Das Projekt wurde mit **Java Swing** entwickelt und ist vollständig kompatibel mit jedem IDE (Eclipse, IntelliJ, NetBeans), solange ein JDK vorhanden ist.

---

## 🚀 Funktionen

- ✔ Eingabe von **Gewicht**, **Größe**, **Alter** und **Geschlecht**  
- ✔ Automatische Berechnung des **BMI**  
- ✔ Bestimmung der **BMI-Kategorie** (Untergewicht, Normalgewicht, etc.)  
- ✔ Berechnung des **Körperfettanteils** nach der Navy-Formel  
- ✔ Intuitive grafische Benutzeroberfläche (Java Swing)  
- ✔ Fehlermeldungen bei ungültigen Eingaben  
- ✔ Saubere Trennung zwischen Logik und GUI

---

## 📂 Projektstruktur

```text
/src
 ├── gui
 │     └── Hauptfenster.java       # Die vollständige GUI
 ├── model
 │     └── Rechner.java            # BMI- und Körperfett-Formeln
 └── Main.java                     # Einstiegspunkt
````

---

## 🛠 Voraussetzungen

* Java **17 oder höher**
* Ein beliebiges Java-IDE:

  * Eclipse
  * IntelliJ IDEA
  * VSCode mit Java Extension

---

## ▶️ Ausführen

1. Projekt herunterladen oder klonen:

   ```bash
   git clone https://github.com/DEIN_USERNAME/BMI-Rechner.git
   ```
2. IDE öffnen
3. Sicherstellen, dass das Projekt ein JDK verwendet
4. `Main.java` ausführen

Die Anwendung startet als Fenster (Swing GUI).

---

## 📘 Formeln

### **BMI**

[
BMI = \frac{Gewicht , (kg)}{(Größe , (m))^2}
]

### **BMI-Kategorien**

| BMI         | Kategorie     |
| ----------- | ------------- |
| < 18.5      | Untergewicht  |
| 18.5 – 24.9 | Normalgewicht |
| 25 – 29.9   | Übergewicht   |
| ≥ 30        | Adipositas    |

---

### **Körperfettanteil** (Navy-Methode)

#### Für Männer:

[
KFA = 495 / (1.0324 - 0.19077 \cdot \log10(Taille - Hals) + 0.15456 \cdot \log10(Größe)) - 450
]

#### Für Frauen:

[
KFA = 495 / (1.29579 - 0.35004 \cdot \log10(Taille + Hüfte - Hals) + 0.22100 \cdot \log10(Größe)) - 450
]

---

## 🖼 Screenshot (Beispiel)

*(Hier kannst du später ein Bild deiner App einfügen)*

---

## 📄 Lizenz

Dieses Projekt ist **frei nutzbar** für Bewerbungen, GitHub-Projekte und Lernzwecke.

---



