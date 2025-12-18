
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
   git clone https://github.com/dylankuitche/BMI-Rechner.git
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

## 🖼 Screenshot 

<img width="871" height="893" alt="Capture d&#39;écran 2025-12-18 135109" src="https://github.com/user-attachments/assets/59405696-6206-43dd-a1ae-1747bb22ee9f" />

