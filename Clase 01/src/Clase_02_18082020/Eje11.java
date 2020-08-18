package Clase_02_18082020;

import java.util.Scanner;

public class Eje11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número entero");
        num=sc.nextInt();
        System.out.println("Cuentas desde 1 hasta "+num);
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
    
}
