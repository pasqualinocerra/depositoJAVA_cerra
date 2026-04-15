import java.lang.classfile.instruction.StackInstruction;

import javax.swing.plaf.synth.SynthStyle;

public class Array {

    public static void main(String[] args){

        //array esercizio 

        //dichiarazione e inizializzazione

        int[] num = new int[5];
        //array di dimenzione 5

        int[] valori = {1,2,3,4,5};
        //iniziallizazione diretta


        //esempio for each array mirko

        int[] num_a= {1,2,3};

        for (int i : num_a) {
            System.out.println(i);
            System.out.println(num_a[i-1]);
        }

        //matrice multidimensionale

        //array 2D
        int[][] matrice = new int [3][3];

        //inizializzazione diretta

        int[][] matricePredefinita = {

            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Elemento centrare" + matrice[1][1]);

    }
    
}
