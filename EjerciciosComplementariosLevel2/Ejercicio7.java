package EjerciciosComplementariosLevel2;

import java.util.Scanner;

public class Ejercicio7{ 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese dos numeros, y que el 1ro sea de menor valor que el 2do: \n1ro: ");
        int numero1 = scan.nextInt();
        System.out.print("2do: ");
        int numero2 = scan.nextInt();
        scan.close();
        
        ArrayString2argumentos(numero1, numero2);
    }
    public static void ArrayString2argumentos(Integer numero1, Integer numero2){
       
        String [] Total = new String[(numero2-numero1)];
        
        int SumTotal = 0;
        for(int i = numero1; i< numero2; i ++){                        
                if(i%3 == 0 && i%2==0){
                    Total[SumTotal] = "FizzBuzz";   
                }
                else if(i%2 == 0){
                    Total[SumTotal] = "Fizz";                
                }
                else if(i%3 == 0){
                    Total[SumTotal] = "Buzz"; 
                }
                else{
                    Total[SumTotal] = (String.valueOf(i));
                }
                SumTotal++;                
        }                
        for(int i =0; i<(numero2-numero1); i++){
            System.out.println(Total[i]);
        }
    }
}