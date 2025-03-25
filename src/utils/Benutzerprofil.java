package utils;
/**
 * Beschreiben Sie hier die Klasse Benutzerprofil.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Benutzerprofil implements ComparableContent<Benutzerprofil>
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String benutzername;

    /**
     * Konstruktor für Objekte der Klasse Benutzerprofil
     */
    public Benutzerprofil(String login, String pw)
    {
        // Instanzvariable initialisieren

    }

    public boolean isGreater(Benutzerprofil pk)
    {
        return true;
    }

    public boolean isLess(Benutzerprofil pk)
    {
        return true;
    }

    public boolean isEqual(Benutzerprofil pk)
    {
        return true;
    }

    public String gibBenutzername()
    {
        // tragen Sie hier den Code ein
        return benutzername;
    }
}

