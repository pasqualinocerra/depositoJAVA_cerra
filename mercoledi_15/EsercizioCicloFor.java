import java.util.Scanner;

public class EsercizioCicloFor {

    public static void main(String[] args){

        //esercizio for

        Scanner scanner = new Scanner(System.in);


        // Richiede un numero all'utente

        System.out.print("Inserisci un numero: ");

        int numero = scanner.nextInt();


        // Stampa la tabellina del numero

        System.out.println("Tabellina del " + numero + ":");


        // Ciclo for per moltiplicare il numero da 1 a 10

        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));

        }


        scanner.close();
    }
    
}
