package org.example.utils;

import java.util.Scanner;

public class ValidateData {

    //----------------------------------------------------------------------------
    public static String validateString(String mensaje, Scanner sc) {

        while (true) {
            System.out.print(mensaje);
            String s = sc.nextLine();
            if (s.trim() != "") {
                return s.trim();
            } else {
                System.out.println("Nombre inválido");
            }
        }
    }

    //-----------------------------------------------------------------------------
    public static int validateEdad(Scanner sc) {

        while (true) {
            System.out.print("Edad estudiante: ");
            String edadString = sc.nextLine();

            try {
                int edad = Integer.parseInt(edadString);
                if (edad >= 18) {
                    return edad;
                } else {
                    System.out.println("la edad debe ser mayor o igual a 18");
                }
            } catch (Exception e) {
                System.out.println("edad inválida");
            }

        }
    }
    //------------------------------------------------------------------------------

    public static double validateNota(String mensaje, Scanner sc) {

        while (true) {
            System.out.print(mensaje);
            String notaString = sc.nextLine();

            try {
                double nota = Double.parseDouble(notaString);
                if (nota >= 0 && nota <= 5) {
                    return nota;
                } else {
                    System.out.println("la nota debe ser entre 0 y 5");
                }
            } catch (Exception e) {
                System.out.println("nota inválida");
            }

        }

    }
    //------------------------------------------------------------------------------

}
