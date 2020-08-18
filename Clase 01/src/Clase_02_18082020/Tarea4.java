/*
 * Crea un array que soporte 5 elementos y devuelva la suma de los elementos de posición impar
 */
package Clase_02_18082020;

import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }
        int suma=0;
        for(int i=0;i<5;i=i+2){
            suma+=num[i];
        }
        for(int i=0;i<5;i=i+2){
            System.out.println(num[i]);
        }
        System.out.println("La suma de los elemento en psoción impar es: "+suma);
    }
    
}
