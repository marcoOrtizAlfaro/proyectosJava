package Clase_01_11082020;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese su nombre: ");
        String nombre=br.readLine();
        System.out.println("Bienvenido "+nombre+".Por favor ingrese su edad");
        String entrada=br.readLine();
        int edad=Integer.parseInt(entrada);
        System.out.println("Gracias, "+nombre+" en 10 años usted tendra "+(edad+10)+" años");
    }
    
}