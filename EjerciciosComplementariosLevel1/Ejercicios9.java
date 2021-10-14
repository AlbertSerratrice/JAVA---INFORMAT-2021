package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicios9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa un texto:");
    String texto = scan.nextLine();

    System.out.println("Ingresa un caracter:");
    char letra = scan.next().charAt(0);
    scan.close();
    int contador = 0;
    for (int i = 0; i < texto.length(); i++) {
      if (letra == texto.charAt(i)) {
        contador++;
      }
    }

    if (contador == 0) {
      System.out.println(String.format("En el texto '%s',no figura el caracter '%c'", texto, letra));
    } else {
      System.out.println(String.format("%s", contador));
    }

    
  }
}