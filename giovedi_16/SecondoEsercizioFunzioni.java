public class SecondoEsercizioFunzioni {

    public static void main(String[] args) {

        // ESERCIZIO 1 
        int sommaRisultato = somma(10, 5);
        System.out.println("Somma: " + sommaRisultato);

        // ESERCIZIO 2
        System.out.println("Multiply int: " + multiply(2, 3));
        System.out.println("Multiply double: " + multiply(2.5, 3.0, 4.0));

        // ESERCIZIO 3
        int sommaNaturaliRisultato = sommaNaturali(5);
        System.out.println("Somma naturali: " + sommaNaturaliRisultato);

        //ESERCIZIO 4

        int x = 10;
        System.out.println("Prima primitivo: " + x);
        x = modificaPrimitivo(x);
        System.out.println("Dopo primitivo: " + x);
        int[] numeri = {1, 2, 3};
        System.out.println("Prima array: " + numeri[0]);
        numeri = modificaArray(numeri);
        System.out.println("Dopo array: " + numeri[0]);
        }

    // ESERCIZIO 1

    static int somma(int a, int b) {
        return a + b;
    }

    // ESERCIZIO 2 

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    // ESERCIZIO 3

    static int sommaNaturali(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sommaNaturali(n - 1);
    }

    // ESERCIZIO 4 

    static int modificaPrimitivo(int n) {
        n = n + 10;
        return n;
        }

    static int[] modificaArray(int[] arr) {
        arr[0] = arr[0] + 10;
        return arr;
        }
    
}