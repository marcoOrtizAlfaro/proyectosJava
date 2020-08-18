package Clase_01_11082020;
import java.util.Scanner;
import java.lang.Math;

public class Prob07 {

    public static void main(String[] args) {
        double r,aC;
        System.out.println("EL ÁREA DEL CÍRCULO");
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        r=sc.nextDouble();
        aC=Math.PI*Math.pow(r,2);
        System.out.println("El área del círculo es: "+aC);
        System.out.println("El perímetro del Círculo es:"+(2*Math.PI*r));
    }
    
}
