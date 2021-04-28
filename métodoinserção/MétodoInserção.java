
package métodoinserção;

import java.util.Random;

public class MétodoInserção {

    /**
     * Ordena um conjuuto de dados pelo método inserção
     * @param v [] int
     */
    public static void insertionSort(int[]v) {
        /* No inicio do processo considera-se um
        elemento na posição correta. Na sequencia
        compara-se com o elemento à direita.
        Se o primeiro elemento for maior que
        o segundo elemento (temp), troque-os de posição.
        Nessa lógica, quando houver mais elementos à
        esquerda deverá ser verificada a quantidade de elementos 
        e se esses elementos à esquerda são maiores que o temp
        Desta forma os elementos são deslocados à direita.
        */
        int j;                               // quantidade de elementos à esquerda
        int temp;                            // 
        for(int i=1; i<v.length; i++){       // responsável pelas varreduras no array
            temp = v[i];                     // elemento que está a direita
            j = i;
            while(j>0 && v[j-1]>=temp){
                v[j] = v[j-1];
                j--;
            }
            v[j] = temp;
        }
    }
    
    public static void exibir(int[]v){
        for(int i=0; i<v.length; i++){
            System.out.println("v["+i+"] = "+ v[i]);
        }
    }
    
    public static void inserir(int[]v){
        Random rd = new Random();
        for(int i=0; i<v.length; i++){
            v[i] = rd.nextInt(100)+1;
            
        }
    }
    
}
