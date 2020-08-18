package Clase_01_11082020;

public class Prob03 {

    public static void main(String[] args) {
        boolean mayorDeEdad,menorDeEdad;
        int edad=21;
        
        mayorDeEdad=edad>=18;
        System.out.println(mayorDeEdad);
        
        menorDeEdad=!mayorDeEdad;
        System.out.println(menorDeEdad);
        
        boolean llueve=false, niebla=true, graniza=false;
        boolean malTiempo = niebla || llueve || graniza;
        System.out.println(malTiempo);
        boolean malTiempo2 = niebla && llueve && graniza;
        System.out.println(malTiempo2);
    }
    
}
