package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios8 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Ingresar nombre y apellido:");
    String nombYapell = scan.nextLine();

    System.out.println("Ingresar su edad:");
    int edad = Integer.parseInt(scan.nextLine());

    System.out.println("Ingresar su dirección:");
    String direccion = scan.nextLine();

    System.out.println("Ingresar su ciudad:");
    String ciudad = scan.nextLine();
    System.out.println(String.format("\n%s - %s - %s - %s", ciudad, direccion, edad, nombYapell));

        scan.close();
  }
}