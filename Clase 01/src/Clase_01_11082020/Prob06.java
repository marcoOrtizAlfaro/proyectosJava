package Clase_01_11082020;

import java.util.Scanner;

public class Prob06 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Bienvenido "+nombre+".Por favor ingrese su edad");
        int edad=sc.nextInt();
        System.out.println("Gracias, "+nombre+" en 10 años usted tendra "+(edad+10)+" años");
    }
}
