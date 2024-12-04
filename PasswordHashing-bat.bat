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
