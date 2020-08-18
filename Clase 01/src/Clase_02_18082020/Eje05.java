package Clase_02_18082020;

public class Eje05 {

    public static void main(String[] args) {
        char c='f';
        switch(c){
            case 'a':
            case 'b':
            case 'c':
                System.out.println("a, b o c");
                break;
            case 'd':
                System.out.println("d");
                break;
            case 'e':
                System.out.println("d o e");
                break;
            default:
                System.out.println("No tiene ningun valor asociado");
        }
    }
}
