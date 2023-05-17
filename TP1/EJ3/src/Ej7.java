import java.util.Arrays;

/*Escribir un programa que reciba por línea de comandos una lista de números enteros en el intervalo [0, 100] 
e imprima por salida estándar un histograma de los mismos. El histograma debe tener 10 intervalos de clase.
 */

public class Ej7 {
    public static void main(String[] args) {
        int[] histograma = new int[10];
        int max = 0;
        for(String str : args){
            int n = (Integer.valueOf(str))/10;
            histograma[n] += 1;

            if(histograma[n] > max){
                max = histograma[n];
            }
        }
        printHistograma(max, histograma);
        //System.out.println(Arrays.toString(histograma));
    }

    private static void printHistograma(int max, int[] histograma){
        for(int i = 0; i < max ; i++){
            System.out.print("|");
            for(int valor : histograma){
            System.out.print(valor >= max - i ? '*' : " ");
            System.out.print(" |");
         }
         System.out.println();
        }
        for (int aFrec : histograma) {
            System.out.print("+---");
        }
        System.out.print("+\n");
        for (int i = 0; i <= histograma.length; i++) {
            System.out.printf("%-4d", i*10);
        }
 
    }
}
