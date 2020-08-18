package Clase_02_18082020;

import java.util.Calendar;

public class Eje12 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        int dia=cal.get(Calendar.DAY_OF_WEEK);
        for(int i=1; i<=7; i++){
            if(dia==1){
                System.out.println("Hoy es el "+i+"° día de la semana");
                break;
            }
            System.out.println("Dia "+i);
        }
        System.out.println("Seguimos...");
    }
    
}
