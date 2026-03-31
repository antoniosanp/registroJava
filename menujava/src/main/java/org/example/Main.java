package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = ValidateData.validateString("Ingresa Nombre: ", sc);

        System.out.println("la palabra es: " + palabra);

        int edad = ValidateData.validateEdad(sc);
        int edad2 = ValidateData.validateEdad(sc);

        System.out.println("edad 1 es: " + edad + " edad 2 es: " + edad2);

        double nota = ValidateData.validateNota("nota del estudiante", sc);

        System.out.println("nota es: " + nota);





        sc.close();

    }
}