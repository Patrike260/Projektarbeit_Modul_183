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
        String[] testPasswords = {"wiss1234", "Passwort123!", "sicheresPasswort", "babaPassword"}; //Hier PW eingeben

        // Passwörter hashen und Ergebnisse anzeigen
        for (String password : testPasswords) {
            String hash = hashPassword(password);
            System.out.println("Originales Passwort: \"" + password + "\"");
            System.out.println("SHA-256-Hash: " + hash);
            System.out.println();
        }
    }
}
