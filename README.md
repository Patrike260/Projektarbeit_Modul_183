# Projektarbeit_Modul_183

#### Teammitglieder: Mazlum Raimi & Patrik Rossetti

## Vorgehungsweise

- Aufgabe gemeinsam besprochen
- Text gemeinsam Analysiert und Stichworte gemacht
- Text mit erarbeitetem Top10-OwAPS verglichen um mögliche Fehlerquellen zu finden
- Grobe planung des Weiteren vorgehen
- Kochen :)

## Erarbeitete Objecte

### 1. Stichwörter aus dem Text

![Stichworter](StichworteZumText.jpg)

### 2. Ist-PlantUML-Diagramm

![Ist-PlantUML-Diagramm](S.jpg)

### 3. Soll-PlantUML-Diagramm

![Soll-PlantUML-Diagramm](S.jpg)

### 4. Java-PasswordHashing

```
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHashing {

    // Methode zum Hashen des Passworts mit SHA-256
    public static String hashPassword(String password) {
        try {
            // MessageDigest-Instanz mit SHA-256 initialisieren
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Passwort in Bytes umwandeln und den Hash berechnen
            byte[] hashBytes = digest.digest(password.getBytes());

            // Byte-Array in einen hexadezimalen String umwandeln
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 Algorithmus nicht gefunden!", e);
        }
    }

    public static void main(String[] args) {
        // Test-Passwörter
        String[] testPasswords = {"123456", "Passwort123!", "sicheresPasswort", "babaPassword"}; //Hier PW eingeben

        // Passwörter hashen und Ergebnisse anzeigen
        for (String password : testPasswords) {
            String hash = hashPassword(password);
            System.out.println("Originales Passwort: \"" + password + "\"");
            System.out.println("SHA-256-Hash: " + hash);
            System.out.println();
        }
    }
}

```

### 5. Bat PasswordHashing

```
@echo off
:loop
:: Eingabeaufforderung für das Passwort
set /p password=Geben Sie das Passwort ein:

:: Temporäre Datei erstellen
echo %password% > temp_password.txt

:: SHA-256-Hash des Passworts berechnen
for /f "skip=1 tokens=*" %%A in ('certutil -hashfile temp_password.txt SHA256 ^| findstr /v "hash"') do (
    set hash=%%A
)

:: Ergebnis anzeigen
echo.
echo Originales Passwort: %password%
echo SHA-256-Hash: %hash%
echo.

:: Temporäre Datei löschen
del temp_password.txt

:: Benutzer fragen, ob das Programm erneut ausgeführt werden soll
set /p repeat=Möchten Sie ein weiteres Passwort hashen? (j/n):
if /i "%repeat%"=="j" goto loop

echo Programm beendet.
pause

```

## Hilfestellung

1. ChatGpt
2. Folien aus dem Untericht
3. Owasp https://owasp.org/www-project-top-ten/
