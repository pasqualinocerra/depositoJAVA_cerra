public class EsercizioOverloading {

    //esercizio overloading funzioni

    public static void main(String[] args) {

        int risultato = fattoriale(4);
        System.out.println("Fattoriale: " + risultato);

        fattoriale("abc");
    }

    static int fattoriale(int n) {

        int risultato = 1;

        for (int i = 1; i <= n; i++) {
            risultato = risultato * i;
        }

        return risultato;
    }

    static void fattoriale(String input) {

        System.out.println("Inserisci un numero valido");
    }
}