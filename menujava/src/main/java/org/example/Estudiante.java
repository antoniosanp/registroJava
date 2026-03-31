package org.example;
import java.util.ArrayList;

public class Estudiante {

    String nombre;
    int edad;
    ArrayList<Double> notas = new  ArrayList<Double>();
    boolean estado = true;

    public  Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void addNota( double nota){
        this.notas.add(nota);
    }

    public double calculatePromedio(){
        double promedio = 0;
        for (double n : notas){
            promedio += n;
        }
        return  promedio/notas.size();
    }
    public void updateEstado(){
        this.estado = !this.estado;
        System.out.println("nuevo estado: Activo ->" + this.estado);
    }


}
