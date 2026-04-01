package org.example;
import org.example.handler.ListaEstudiantes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEstudiantes lista = new ListaEstudiantes();

        System.out.println("Bienvenido al sistema de notas riwi java");
        boolean app = true;
        while (app){
            System.out.println("Elige una opción:");
            System.out.println("1: Agregar nuevo Estudiante");
            System.out.println("2: Agregar nueva nota a Estudiante");
            System.out.println("3: Calcular promedio");
            System.out.println("4: Buscar Estudiante");
            System.out.println("5: Mostrar todos los Estudiantes");
            System.out.println("6: salir");

            String opcion = sc.nextLine();

            switch (opcion) {

                case "1" -> Menu.opcionAgregarEstudiante(lista, sc);
                case "2" -> Menu.opcionAgregarNotaEstudiante(lista, sc);
                case "3" -> {double promedio = Menu.opcionObenerPromedioEstudiante(lista, sc);
                    System.out.println("el promedio es: " + promedio);}
                case "4" -> Menu.opcionBuscarEstudiante(lista, sc);
                case "5" -> Menu.opcionMostrarTodos(lista);
                case "6" -> app = false;
                default -> System.out.println("opción inválida");

            }





        }




        sc.close();

    }
}