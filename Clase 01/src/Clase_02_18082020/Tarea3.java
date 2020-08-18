/*
 * Dado tres números ordenelos de mayor a menor
 */
package Clase_02_18082020;

import java.util.Scanner;

public class Tarea3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        int mayor,inte,menor;
        System.out.print("Número 01: ");n1=sc.nextInt();
        System.out.print("Número 02: ");n2=sc.nextInt();
        System.out.print("Número 03: ");n3=sc.nextInt();
        
        //Calculando el número mayor
        if(n1>n2){
            if (n1>n3){
                mayor=n1;
                if(n2>n3){
                    inte=n2;
                    menor=n3;
                }else{
                    inte=n3;
                    menor=n2;
                }
            }else{
                mayor=n3;
                 if(n1>n2){
                    inte=n1;
                    menor=n2;
                }else{
                    inte=n2;
                    menor=n1;
                }
            }
        }else{
            if(n2>n3){
                mayor=n2;
                 if(n1>n3){
                    inte=n1;
                    menor=n3;
                }else{
                    inte=n3;
                    menor=n1;
                }
            }else{
                mayor=n3;
                 if(n1>n2){
                    inte=n1;
                    menor=n2;
                }else{
                    inte=n2;
                    menor=n1;
                }
            }
        }
        System.out.println("Número Mayor..........:"+mayor);
        System.out.println("Número Intermedio: ...:"+inte);
        System.out.println("Número Menor..........:"+menor);
    }
}