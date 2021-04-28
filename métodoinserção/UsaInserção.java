/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package métodoinserção;

/**
 *
 * @author starc
 */
public class UsaInserção {
    public static void main(String args[]){
        int [] v = new int[10000];
        
        
        MétodoInserção.inserir(v);
        System.out.println("=== Array inicial ===");
        MétodoInserção.exibir(v);
        long ti = System.currentTimeMillis();
        MétodoInserção.insertionSort(v);
        long tf = System.currentTimeMillis();
        long intervalo = tf-ti;
        System.out.println("=== Array Ordenado ===");
        MétodoInserção.exibir(v);
        
        System.out.println("Tempo = "+intervalo);
    }
}
