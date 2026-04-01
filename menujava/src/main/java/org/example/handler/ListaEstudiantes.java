package org.example.handler;
import org.example.models.Estudiante;

import java.util.ArrayList;

public class ListaEstudiantes {

    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();


    public Estudiante encontrarEstudiante(String nombre) {
        if (this.listaEstudiantes == null) {
            return null;
        }
        for (Estudiante e : this.listaEstudiantes) {
            if (e.nombre.equals(nombre)) {
                return e;
            }
        }
        return null;
    }

    public void addEstudiante(Estudiante e) {
        Estudiante existe = this.encontrarEstudiante(e.nombre);

        if (existe != null) {
            System.out.println("Estudiante actualmente registrado");
            return;
        }
        this.listaEstudiantes.add(e);
        System.out.println("estudiante agregado correctamente " + e.toString());
        return;
    }

    public void addNotaEstudiante(Estudiante e, double nota) {
        Estudiante existe = this.encontrarEstudiante(e.nombre);
        if (existe == null) {
            System.out.println("estudiante no encontrado");
            return;
        }
        e.addNota(nota);
        System.out.println(e.nombre + "| Notas: " + e.notas.toString());
    }

    public double calculatePromedioEstudiante(Estudiante e) {
        Estudiante existe = this.encontrarEstudiante(e.nombre);
        if (existe == null) {
            System.out.println("estudiante no encontrado");
            return -1;
        }

        return e.calculatePromedio();
    }

    public void mostarEstudiantes() {
        if (this.listaEstudiantes.isEmpty()) {
            System.out.println("no hay estudiantes");
            return;
        }
        for (Estudiante e : this.listaEstudiantes){
            System.out.println(e.toString());
        }

    }

}
