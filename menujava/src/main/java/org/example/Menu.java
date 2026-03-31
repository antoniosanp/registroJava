package org.example;

import java.util.Scanner;

public class Menu {

    public static void opcionAgregarEstudiante(ListaEstudiantes lista, Estudiante e, Scanner sc){

        String nombre = ValidateData.validateString("Nombre del estudiante: ", sc);
        int edad = ValidateData.validateEdad(sc);

        Estudiante estudiante = new Estudiante(nombre,edad);

        lista.addEstudiante(estudiante);
    };

    public  static void opcionAgregarNotaEstudiante(ListaEstudiantes lista, Estudiante e, Scanner sc){
        double nota = ValidateData.validateNota("nota: ",  sc);
        lista.addNotaEstudiante(e, nota);
    };

    public static double opcionObenerPromedioEstudiante(ListaEstudiantes lista, Estudiante e){
        return lista.calculatePromedioEstudiante(e);
    };

    public  static Estudiante opcionObenerEstudiante(ListaEstudiantes lista, String nombre){
        return lista.encontrarEstudiante(nombre);
    };

}
