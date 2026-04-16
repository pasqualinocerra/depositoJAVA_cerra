import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EsercizioArrayList {
    
    public static void main(String[] args){

        //esercizio arraylist.

        ArrayList<String> nomiStudenti = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci nome (scrivi 'fine' per terminare): ");
            String nome = input.nextLine();

            if (nome.equalsIgnoreCase("fine")) {
                break;
            }

            nomiStudenti.add(nome);
        }

        Collections.sort(nomiStudenti);

        System.out.println("Elenco studenti in ordine alfabetico:");
        for (String nome : nomiStudenti) {
            System.out.println(nome);
        }

        System.out.println("Numero totale studenti: " + nomiStudenti.size());

        while (true) {
            System.out.print("Inserisci nome da eliminare (scrivi 'fine' per uscire): ");
            String daEliminare = input.nextLine();

            if (daEliminare.equalsIgnoreCase("fine")) {
                break;
            }

            if (nomiStudenti.contains(daEliminare)) {
                nomiStudenti.remove(daEliminare);
                System.out.println("Studente rimosso.");
            } else {
                System.out.println("Nome non trovato.");
            }
        }

        System.out.println("Lista aggiornata:");
        for (String nome : nomiStudenti) {
            System.out.println(nome);
        }
    }
}
