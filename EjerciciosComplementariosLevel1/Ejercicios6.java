package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios6 {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar 2 números enteros:");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        scan.close();
        int po = numero1;
        for(int i = numero2; i>1; i--){
            po *= numero1;            
        }
        System.out.println(numero1 + " elevado a " + numero2 + " = " + po);
    }
}
