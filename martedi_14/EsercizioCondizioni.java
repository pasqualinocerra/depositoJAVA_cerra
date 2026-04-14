public class EsercizioCondizioni {
    public static void main(String[] args) {

        int eta = 30;
        boolean biglietto = true;
        boolean accompagnato = false;
        boolean saltaFila = true;

        if (eta > 18) {
            System.out.println("sei maggiorenne");
        } else {
            System.out.println("sei minorenne");
        }

        if (biglietto) {
            System.out.println("hai un biglietto valido");
        } else {
            System.out.println("non puoi entrare");
        }

        if (accompagnato) {
            System.out.println("sei accompagnato");
        } else {
            System.out.println("non sei accompagnato");
        }

        if (saltaFila) {
            System.out.println("hai il salta fila");
        } else {
            System.out.println("non hai il salta fila");
        }
    }
}