package org.example;

import org.example.handler.ListaEstudiantes;
import org.example.models.Estudiante;
import org.example.utils.ValidateData;

import java.util.Scanner;

public class Menu {

    public static void opcionAgregarEstudiante(ListaEstudiantes lista, Scanner sc){
        System.out.println("Agregar Estudiante");
        String nombre = ValidateData.validateString("Nombre del estudiante: ", sc);
        int edad = ValidateData.validateEdad(sc);

        Estudiante estudiante = new Estudiante(nombre,edad);

        lista.addEstudiante(estudiante);
    };

    public  static void opcionAgregarNotaEstudiante(ListaEstudiantes lista, Scanner sc){
        System.out.println("Agregar nota");
        String nombre = ValidateData.validateString("Nombre del estudiante: ", sc);
        Estudiante e = Menu.opcionObenerEstudiante(lista, nombre);
        if (e == null) {return;}
        double nota = ValidateData.validateNota("nota: ",  sc);
        lista.addNotaEstudiante(e, nota);
    };

    public static double opcionObenerPromedioEstudiante(ListaEstudiantes lista, Scanner sc){
        System.out.println("Promedio de Estudiante");
        String nombre = ValidateData.validateString("Nombre del estudiante: ", sc);
        Estudiante e = Menu.opcionObenerEstudiante(lista, nombre);
        if (e == null) {return 0;}
        return lista.calculatePromedioEstudiante(e);
    };

    public  static Estudiante opcionObenerEstudiante(ListaEstudiantes lista, String nombre){
        return lista.encontrarEstudiante(nombre);
    };
    public  static Estudiante opcionBuscarEstudiante(ListaEstudiantes lista, Scanner sc){
        String nombre = ValidateData.validateString("Nombre del estudiante: ", sc);
        Estudiante e = Menu.opcionObenerEstudiante(lista, nombre);
        if (e == null) {
            System.out.println("Estudiante no encontrado");
            return null;}
        System.out.println(e.toString());
        return e;
    }
    public static void opcionMostrarTodos(ListaEstudiantes lista){
        System.out.println("Todos los Estudiantes: ");
        lista.mostarEstudiantes();
    }

}
