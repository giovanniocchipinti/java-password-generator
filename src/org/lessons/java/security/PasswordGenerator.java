package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        //* Creazione scanner per far prendere la parola inserita dall'utente */
        Scanner input = new Scanner(System.in);

        //* Messaggio di intestazione */
        System.out.println("Inserisci i dati richiesti per generare una password:");

        //* Richieste di inserimento dati all'utente */
        System.out.println("Inserisci il tuo nome e premi invio");
        String userName = input.nextLine();

        System.out.println("Inserisci il tuo cognome e premi invio:");
        String userSurname = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito e premi invio:");
        String userFavCol = input.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita e premi invio");
        int userBirthDay = input.nextInt();

        System.out.println("Inserisci il tuo mese di nascita in formato numero e premi invio");
        int userBirthMonth = input.nextInt();

        System.out.println("Inserisci il tuo anno di nascita e premi invio");
        int userBirthYear = input.nextInt(); 

        //* Generazione password con concatenazione */
        String pswGen = userName + "-" + userSurname + "-" + userFavCol + "-" + (userBirthDay + userBirthMonth + userBirthYear);

        //* Stampa della password generata */ 
        System.out.println("La password è: " + pswGen);

        
        input.close();

    }
}
