# Unit Converter (Android)

*Simple and fast unit conversion app* — converts between weight, length, area, fuel, volume, and temperature units. Built with Java and XML in Android Studio for beginners and students.

---

## ✅ Features

- Convert between common units for:
  - Weight (kg, g, lb, oz)
  - Length (m, cm, mm, km, in, ft, yd, mi)
  - Area (m², cm², ft², yd², acre)
  - Fuel (L, mL, gallon)
  - Volume (L, mL, m³, cu in, cu ft)
  - Temperature (°C, °F, K)
- Clean, responsive XML layout
- Input validation and helpful error messages
- Remember last-used units for quick conversions
- Lightweight (no external network calls required)

---

## 📁 Project structure (suggested)

app/  
├─ src/main/java/com/example/unitconversion/  
│  ├─ MainActivity.java  
│  ├─ converters/  
│  │  ├─ WeightConverter.java  
│  │  ├─ LengthConverter.java  
│  │  └─ TemperatureConverter.java  
│  └─ adapters/  
│     └─ UnitSpinnerAdapter.java  
├─ src/main/res/  
│  ├─ layout/activity_main.xml  
│  ├─ values/strings.xml  
│  └─ drawable/  
└─ build.gradle  

---

## 🔧 Installation & Run

1. Clone or download the project to your machine.  
2. Open Android Studio.  
3. Choose *Open an existing Android Studio project* and select the project folder.  
4. Let Android Studio sync Gradle and download dependencies.  
5. Connect an Android device (or start an emulator).  
6. Run the app (Run ▶) or Shift+F10.  

---

## 🛠 How to use

1. Open the app.  
2. Select a conversion category (Weight, Length, Area, Fuel, Volume, Temperature).  
3. Choose the From and To units from the dropdowns.  
4. Enter a numeric value and press *Convert*.  
5. Result appears below with the converted value.  

---

## 📐 Sample conversion logic (Java)

> Place converters in com.example.unitconversion.converters.

```java
public class LengthConverter {
    public static double metersToKilometers(double m) {
        return m / 1000.0;
    }
    // add other conversion helpers or a central convert(fromUnit, toUnit, value)
}
