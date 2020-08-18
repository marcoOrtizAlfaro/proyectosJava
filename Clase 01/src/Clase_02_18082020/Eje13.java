package Clase_02_18082020;

import java.util.Scanner;

public class Eje13 {

    public static void main(String[] args) {
        int[] num=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            num[i]=sc.nextInt();
        }
        int suma=0;
        for(int i=0;i<4;i++){
            suma+=num[i];
        }
        for(int i=0;i<4;i++){
            System.out.println(num[i]);
        }
        System.out.println("La Suma es: "+suma);
        System.out.println("La Media es: "+suma/4);
    }
    
}
