package Clase_02_18082020;

public class Eje10 {

    public static void main(String[] args) {
        int numero=20;
        System.out.println("Número par menor que: "+numero);
        
        int n;
        do{
            n=(int) (Math.random()*numero);
            System.out.println(n);
        }while(n%2!=0);
        System.out.println("Y el número elegido es: "+n);
    }
}
