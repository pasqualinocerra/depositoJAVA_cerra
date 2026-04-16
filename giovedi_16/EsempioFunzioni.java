public class EsempioFunzioni {

    //esempio funzioni

    public static void main(String[] args) {

        // chiamata del metodo
        saluta();

        // esempio con metodo che ritorna un valore
        int risultato = somma(5, 3);
        System.out.println("Risultato somma: " + risultato);
    }

    // metodo void (non ritorna nulla)
    static void saluta() {
        System.out.println("Ciao, Java!");
    }

    // metodo con return (ritorna un valore)
    static int somma(int a, int b) {
        return a + b;
    }
}