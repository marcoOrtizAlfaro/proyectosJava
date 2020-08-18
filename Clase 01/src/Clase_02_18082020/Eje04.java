package Clase_02_18082020;

public class Eje04 {

    public static void main(String[] args) {
        int temperatura=30;boolean nevado=true;
        
        if (temperatura > 25){
            System.out.println("A la Playa!!!");
        }else if(temperatura > 15){
            System.out.println("A la Montaña!!!");
        }else if(temperatura<5 && nevado){
            System.out.println("A Esquiar!!!");
        }else{
            System.out.println("A descanzar... zZz");
        }
    }
}
