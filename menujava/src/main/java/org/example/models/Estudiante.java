package org.example.models;
import java.util.ArrayList;

public class Estudiante {

    public String nombre;
    public int edad;
    public ArrayList<Double> notas = new  ArrayList<Double>();
    public boolean estado = true;

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", notas=" + notas +
                ", estado=" + estado +
                '}';
    }

    public  Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void addNota( double nota){
        this.notas.add(nota);
    }

    public double calculatePromedio(){
        double promedio = 0;
        if (notas.isEmpty()) return 0;
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
