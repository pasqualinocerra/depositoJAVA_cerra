import java.util.Scanner;

public class SecondoEsercizioArray {
    
    public static void main(String[] args){

        //esercizio con gli array

        Scanner input = new Scanner(System.in);

        int numeroDolci;

        do{
            System.out.println("Quanti dolci vuoi ordinare? ");
            numeroDolci = input.nextInt();
        }while(numeroDolci <=0 || numeroDolci > 10);

        input.nextLine();

        String[] dolci= new String[numeroDolci];
        int[] quantita= new int[numeroDolci];

        int totale= 0;

        for(int i = 0; i < numeroDolci; i++ ){

            System.out.println("Inserisci nome dolce: ");
            dolci[i] = input.nextLine();

            do{
                System.out.println("Inserisci quantità per " + dolci[i] + ": ");
                quantita[i] = input.nextInt();

                if(quantita[i] < 0){
                    System.out.println("Errore! Quantità negativa, riprova!");
                }
            }while(quantita[i] < 0);

            input.nextLine();

            totale += quantita[i];
        }


        for (int i = 0; i < numeroDolci; i++) {
            System.out.println(dolci[i] + " -> " + quantita[i]);
        }

        System.out.println("Totale dolci ordinati: " + totale);

    }
}
