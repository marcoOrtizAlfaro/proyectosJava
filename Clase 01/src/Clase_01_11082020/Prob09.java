package Clase_01_11082020;

import java.util.Scanner;

public class Prob09 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,s,p;
        System.out.println("Ingrese un número");
        n1=sc.nextInt();
        System.out.println("Ingrese un número");
        n2=sc.nextInt();
        
        s=n1+n2;
        p=n1*n2;
        
        System.out.println("La Suma es......:"+s);
        System.out.println("El Producto es..:"+p);
    }
    
}
