import java.util.Scanner;

//esercizio difficile funzioni

public class EsercizioDifficileFunzioni {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quanti voti vuoi inserire?");
        int n = input.nextInt();

        int[] voti = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci voto " + (i + 1) + ": ");
            voti[i] = input.nextInt();
        }

        int scelta = 0;

        while (scelta != 5) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Calcola media");
            System.out.println("2 - Voto più alto");
            System.out.println("3 - Voto più basso");
            System.out.println("4 - Verifica promozione");
            System.out.println("5 - Esci");

            scelta = input.nextInt();

            switch (scelta) {

                case 1:
                    System.out.println("Media: " + calcolaMedia(voti));
                    break;

                case 2:
                    System.out.println("Massimo: " + trovaMax(voti));
                    break;

                case 3:
                    System.out.println("Minimo: " + trovaMin(voti));
                    break;

                case 4:
                    double media = calcolaMedia(voti);
                    if (media >= 6) {
                        System.out.println("Promosso");
                    } else {
                        System.out.println("Bocciato");
                    }
                    break;

                case 5:
                    System.out.println("Uscita...");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }

        input.close();
    }

    static double calcolaMedia(int[] voti) {

        int somma = 0;

        for (int i = 0; i < voti.length; i++) {
            somma = somma + voti[i];
        }

        return (double) somma / voti.length;
    }

    static int trovaMax(int[] voti) {

        int max = voti[0];

        for (int i = 0; i < voti.length; i++) {
            if (voti[i] > max) {
                max = voti[i];
            }
        }

        return max;
    }

    static int trovaMin(int[] voti) {

        int min = voti[0];

        for (int i = 0; i < voti.length; i++) {
            if (voti[i] < min) {
                min = voti[i];
            }
        }

        return min;
    }
}