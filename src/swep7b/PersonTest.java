package swep7b;

import uebungen3A.InputTools;

class PersonTest {
    public static void main(String[] args) {
     
        System.out.println("Bitte geben Sie die Personendaten ein:");
        String vorname = InputTools.readString("Vorname: ");
        String name = InputTools.readString("Name: ");
        int tag = InputTools.readInteger("Geburtstag: ");
        int monat = InputTools.readInteger("Geburtsmonat: ");
        int year = InputTools.readInteger("Geburtsjahr: ");

        Person person = new Person(name, vorname, tag, monat, year);

        System.out.println("\nBitte geben Sie das aktuelle Datum ein:");
        int aktTag = InputTools.readInteger("Tag: ");
        int aktMonat = InputTools.readInteger("Monat: ");
        int aktYear = InputTools.readInteger("Jahr: ");

        System.out.println("\n" + person);
        if (person.isKonsistent()) {
            int alter = person.alter(aktTag, aktMonat, aktYear);
            System.out.println("Alter: " + alter + " Jahre");
        } else {
            System.out.println("Ungültige Personendaten!");
        }
    }
}
