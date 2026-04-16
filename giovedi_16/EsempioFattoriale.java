public class EsempioFattoriale {

    //esempio fattoriale
    
    public static void main(String[] args){

        int fattoriale(int n) {
            if (n == 1) return 1;
            return n * fattoriale(n -1);
            
        }
    }
}
