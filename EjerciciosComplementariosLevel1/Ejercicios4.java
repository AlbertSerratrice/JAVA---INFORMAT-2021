package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios4 {
    public static void main(String args[]){        
        Scanner scan = new Scanner(System.in);
                
        System.out.print("ingresar un numero para calcular su factorial: ") ;

        int numero = scan.nextInt();
        
        int resultado = 1;
                
        for( int i = numero; i > 0; i--){
            resultado = resultado*i;            
        }
        System.out.println("El factorial de " + numero + " es: " + resultado); 
        scan.close();   
    }
}