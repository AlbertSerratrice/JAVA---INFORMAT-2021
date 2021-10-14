package EjerciciosComplementariosLevel2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
        public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        
        System.out.println("Ingresar 5 números enteros: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        scan.close();


        num.add(num1);
        num.add(num2);
        num.add(num3);
        num.add(num4);
        num.add(num5);

        int largo = num.size();

        System.out.println(num);
        System.out.println(largo);

        num.add(0, 0);
        num.add(6, 6);

        largo = num.size();


        System.out.println(num);
        System.out.println(largo);


    }

}