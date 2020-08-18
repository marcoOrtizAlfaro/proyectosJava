package Clase_02_18082020;

public class Eje09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=4557888,digitos=0;
        while (num>0){
            num/=10;
            digitos++;
        }
        System.out.println(digitos);
    } 
}
