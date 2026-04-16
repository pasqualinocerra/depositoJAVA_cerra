public class EsempioOverloading {

    //esempio overloading
    
    static void mostra(int numero) {

    System.out.println("Numero: " +( 10 + numero));

}


static void mostra(String testo) {

    System.out.println("Testo: " + testo);

}


public static void main(String[] args) {

    mostra(10);       // Chiama mostra(int)

    mostra("Ciao");  // Chiama mostra(String)

}
}
