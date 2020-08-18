package Clase_01_11082020;

import java.util.Scanner;
import java.lang.Math;
public class Prob10 {

    public static void main(String[] args) {
        int l, a, p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el lado: ");
        l=sc.nextInt();
        a=(int) Math.pow(l, 2);
//        a=(int) Math.pow(l, 2);
        p=4*l;
        
        System.out.println("El área es.......:"+a);
        System.out.println("El Perímetro es..:"+p);
    }
}
