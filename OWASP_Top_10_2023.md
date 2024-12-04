# OWASP Top 10 Sicherheitsrisiken

---

## 1. Broken Access Control

**Beschreibung**: Zugriffsbeschränkungen sind nicht korrekt implementiert, wodurch Benutzer auf Daten oder Funktionen zugreifen können, die sie nicht berechtigt sind zu sehen oder zu ändern.  
**Gegenmaßnahme**: Implementierung korrekter Zugriffskontrollen, Anwendung des Prinzips der geringsten Rechte und regelmäßige Audits.  
**Beispiel**: Ein Benutzer kann auf die privaten Daten eines anderen Benutzers zugreifen, da keine Überprüfung auf Benutzerrechte erfolgt.

---

## 2. Cryptographic Failures

**Beschreibung**: Fehler in der Verschlüsselung, z. B. die Nutzung unsicherer Algorithmen oder fehlende Verschlüsselung sensibler Daten.  
**Gegenmaßnahme**: Verwendung starker, bewährter Verschlüsselungsstandards und regelmäßige Überprüfung der Schlüsselverwaltung.  
**Beispiel**: Passwörter werden unverschlüsselt in der Datenbank gespeichert.

---

## 3. Injection

**Beschreibung**: Einschleusen schädlicher Daten in Befehle (z. B. SQL, NoSQL, LDAP).  
**Gegenmaßnahme**: Verwendung sicherer APIs und Eingabevalidierung.  
**Beispiel**: Ein Angreifer gibt SQL-Code in ein Formularfeld ein, um Daten aus der Datenbank zu stehlen.

---

## 4. Insecure Design

**Beschreibung**: Schwachstellen im Design der Anwendung, z. B. fehlende Sicherheitsüberlegungen in der Planungsphase.  
**Gegenmaßnahme**: Sicherheitsorientierte Softwareentwicklung und Bedrohungsanalysen.  
**Beispiel**: Fehlendes Schutzkonzept gegen Brute-Force-Angriffe.

---

## 5. Security Misconfiguration

**Beschreibung**: Falsche oder unsichere Konfiguration von Anwendungen, Servern oder Datenbanken.  
**Gegenmaßnahme**: Standardpasswörter ändern, Sicherheitsrichtlinien umsetzen und Konfiguration regelmäßig prüfen.  
**Beispiel**: Ein öffentlich zugänglicher Server mit Standardadministratorpasswort.

---

## 6. Vulnerable and Outdated Components

**Beschreibung**: Verwendung veralteter oder unsicherer Softwarekomponenten.  
**Gegenmaßnahme**: Regelmäßige Aktualisierung und Entfernung nicht benötigter Komponenten.  
**Beispiel**: Nutzung einer veralteten JavaScript-Bibliothek mit bekannten Sicherheitslücken.

---

## 7. Identification and Authentication Failures

**Beschreibung**: Schwächen bei der Identitätsprüfung, wie z. B. ungesicherte Login-Systeme.  
**Gegenmaßnahme**: Implementierung starker Authentifizierungsmechanismen, wie Multi-Faktor-Authentifizierung (MFA).  
**Beispiel**: Fehlende Ratenbegrenzung bei Login-Versuchen erlaubt Brute-Force-Angriffe.

---

## 8. Software and Data Integrity Failures

**Beschreibung**: Fehlende Validierung der Softwareintegrität, wodurch Angreifer bösartigen Code einfügen können.  
**Gegenmaßnahme**: Verwendung von Signaturen und sicheren Updatemechanismen.  
**Beispiel**: Ein Angreifer manipuliert Software-Updates, die ungesichert heruntergeladen werden.

---

## 9. Security Logging and Monitoring Failures

**Beschreibung**: Fehlendes oder unzureichendes Protokollieren und Überwachen von sicherheitsrelevanten Ereignissen.  
**Gegenmaßnahme**: Implementierung umfassender Protokollierungs- und Überwachungssysteme.  
**Beispiel**: Angriffsversuche bleiben unentdeckt, da keine Logs vorhanden sind.

---

## 10. Server-Side Request Forgery (SSRF)

**Beschreibung**: Der Server führt von Angreifern initiierte Anfragen zu internen oder externen Ressourcen aus.  
**Gegenmaßnahme**: Einschränkung der zulässigen Anfragen und Validierung von Eingaben.  
**Beispiel**: Ein Angreifer nutzt eine SSRF-Schwachstelle, um Zugang zu internen Systemen zu erhalten.

---

## Quellen

**ChatGpt**

**Owasp** https://owasp.org/www-project-top-ten/
