/*
 * Construya una calculadora
 *Las opciones permitidas son: Suma, División y la Multiplicación
 *Considerar el caso que el denominador sea cero (Mostrar como respusta NO SE PUEDE DIVIDIR CON CERO"
 * Si elige una opción no considerada, muestre el mensaje: OPERACIÓN NO VÁLIDA
 */
package Clase_02_18082020;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n1, n2, res=0;
        int op;
        System.out.print("Ingrese número 01: ");
        n1=sc.nextFloat();
        System.out.print("Ingrese número 02: ");
        n2=sc.nextFloat();
        System.out.println("CALCULADORA");
        System.out.println("===========");
        System.out.println("[1] Suma");
        System.out.println("[2] División");
        System.out.println("[3] Multiplicación");
        System.out.println("Eliga una opción");
        op=sc.nextInt();
        switch(op){
            case 1://Suma
                res=n1+n2;
                break;
            case 2://División
                if (n2!=0){
                    res=n1/n2;
                    break;
                }else{
                    System.out.println("NO SE PUEDE DIVIDIR CON CERO");
                }
            case 3://Multiplicación
                res=n1*n2;
                break;
            default:
                System.out.println("OPERACIÓN NO VÁLIDA");
        }
        System.out.println("La Respuesta es: "+res);
    }
    
}
