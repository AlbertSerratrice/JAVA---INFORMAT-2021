package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
  public static void main(String[] args) {
    List<String> Estudiantes = new ArrayList<>();

    cargarListaAlumnos(Estudiantes);
    System.out.println("Todos los Alumnos:");
    mostrarListaAlumnos(Estudiantes);

    List<String> Curso1 = Estudiantes.subList(0, 4);
    System.out.println("Grupo 1:");
    mostrarListaAlumnos(Curso1);

    List<String> Curso2 = Estudiantes.subList(4, 8);
    System.out.println("Grupo 2:");
    mostrarListaAlumnos(Curso2);

    List<String> Curso3 = Estudiantes.subList(8, 12);
    System.out.println("Grupo 3:");
    mostrarListaAlumnos(Curso3);
  }

  private static void mostrarListaAlumnos(List<String> Estudiantes) {
    for (String Estudiante : Estudiantes) {
      System.out.println("->" + Estudiante);
    }
  }

  private static void cargarListaAlumnos(List<String> Estudiantes) {
    Estudiantes.add("Julio");
    Estudiantes.add("Marina");
    Estudiantes.add("Dante");
    Estudiantes.add("Jazmin");
    Estudiantes.add("Alvaro");
    Estudiantes.add("Edith");
    Estudiantes.add("Leandro");
    Estudiantes.add("Angelica");
    Estudiantes.add("Dardo");
    Estudiantes.add("Jessica");
    Estudiantes.add("Javier");
    Estudiantes.add("Andrea");
  }
}