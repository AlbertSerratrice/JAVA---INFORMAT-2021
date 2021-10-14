package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios7 {    
    public static void main(String[] args) {
              
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Ingresar un string en minusculas y vea el resultado en mayusculas :");
        String txtMin = scan.nextLine();
        
        String txtMay = "";
        
        for(int i =0 ; i < txtMin.length() ; i++){
            if(String.valueOf((txtMin.charAt(i))).equals(" ")){        
                txtMay+= " ";
            }
            for(int c = 65; c <= 90; c++){
                String letraMay = Character.toString(c);{}
                if(String.valueOf((txtMin.charAt(i))).equalsIgnoreCase(letraMay)){
                    txtMay += letraMay;
                    
                    scan.close();
                }
            }    
        }
        System.out.println(txtMay);        
    }    
}