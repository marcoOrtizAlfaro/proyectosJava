/*
 * Determine el sueldo del trabajador, teniendo en cuenta:
 * Si labora hasta 40 horas su sueldo sería 930
 * Si labora hasta 60 horas su sueldo sería 1130
 * Si labora hasta 70 horas su sueldo sería 1330
 * Si labora mas 70 horas su sueldo sería 1500
 */
package Clase_02_18082020;

public class Tarea1 {

    public static void main(String[] args) {
       int horas=71;
       if (horas<=40){
           System.out.println("Su sueldo es de 930 soles");
       }else if(horas<=60){
           System.out.println("Su sueldo es de 1130 soles");
       }else if(horas<=70){
           System.out.println("Su sueldo sera 1330 soles");
       }else{
           System.out.println("Su sueldo seria 1500 soles");
        }
    }
}
