import java.util.Scanner;

public class SecondoEsercizioCicli {
    
    public static void main(String[] args){

        //esercizio ciclo for e while

        Scanner input = new Scanner(System.in);

        int numeroVoti = 0;

        while (numeroVoti <= 0) {
            System.out.println("Quanti voti vuoi inserire? ");
            numeroVoti = input.nextInt();
        }

        int votiValidi = 0;
        String listaVotiValidi = "";

        for(int i = 0; i < numeroVoti; i++){

            System.out.print("Inserisci voto: ");
            int voto = input.nextInt();

            if (voto < 0 || voto > 30) {
                System.out.println("Voto non valido");
            } else {

                votiValidi++;

                listaVotiValidi = listaVotiValidi + voto + " ";

                if (voto < 18) {
                    System.out.println("Insufficiente");
                } else if (voto < 24) {
                    System.out.println("Sufficiente");
                } else {
                    System.out.println("Buono o Ottimo");
                }
            }
        }

        System.out.println("\nVoti validi inseriti:");
        System.out.println(listaVotiValidi);

        System.out.println("Totale voti validi: " + votiValidi);
    }
}