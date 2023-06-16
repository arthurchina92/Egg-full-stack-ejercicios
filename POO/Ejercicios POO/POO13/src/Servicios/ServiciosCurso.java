/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author ARTURO
 */
public class ServiciosCurso {
    Curso curso = new Curso();
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(){
        
        String vector [] = new String [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno");
            vector[i]= leer.next();
        }
        curso.setAlumnos(vector);
    }
    
    public Curso crearCurso(){
        System.out.println("Ingresa el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Cual es la cantidad de horas del curso");
        curso.setCantidadHorasDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana que cubre el curso");
        curso.setCantidadDiasSemana(leer.nextInt());
        System.out.println("Ingrese el turno");
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora ");
        curso.setPrecioHora(leer.nextInt());
        cargarAlumnos();
        
        return curso;
    }
    
    public void calcularGanancia(){
        System.out.println(" La ganancia semanal es: " + (curso.getCantidadDiasSemana()*curso.getCantidadHorasDia()*curso.getPrecioHora()*curso.getAlumnos().length));
    }
    
}
