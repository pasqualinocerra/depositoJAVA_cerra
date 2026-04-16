import java.util.ArrayList;

public class EsempioArrayList {
    
    public static void main(String[] args){

        //arraylist esempio

        ArrayList<Integer> numeri = new ArrayList<>();
            numeri.add(10);
            numeri.add(20);
            numeri.add(30);


            //secondo esempio arraylist

            ArrayList<String> nomi = new ArrayList<>();
            nomi.add("Alice");
            nomi.add("Bob");
            nomi.add("Carlo");
            System.out.println("Primo nome: " + nomi.get(0));
    }
}
