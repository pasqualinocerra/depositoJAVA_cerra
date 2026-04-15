import java.util.Scanner;

public class EsercizionWhile {

    public static void main(String[] args){

        //esercizio while

        
        Scanner input = new Scanner(System.in);

        String passwordCorretta = "java123";
        int tentativi = 0;
        boolean accessoRiuscito = false;

        while (tentativi < 3 && !accessoRiuscito) {

            System.out.print("Inserisci password: ");
            String inputPassword = input.nextLine();

            if (inputPassword.equals(passwordCorretta)) {
                System.out.println("Login riuscito!");
                accessoRiuscito = true;
            } else {
                tentativi++;
                System.out.println("Password errata. Tentativi: " + tentativi);
            }
        }

        if (!accessoRiuscito) {
            System.out.println("Accesso bloccato");
        }

        if (accessoRiuscito) {

            String scelta;

            do {
                System.out.print("Vuoi accedere al sistema? (s/n): ");
                scelta = input.nextLine();
            } while (!scelta.equals("s") && !scelta.equals("n"));

            switch (scelta) {
                case "s":
                    System.out.println("Accesso al sistema effettuato");
                    break;

                case "n":
                    System.out.println("Accesso annullato");
                    break;
            }
        }

        input.close();
    
    }
    
}
