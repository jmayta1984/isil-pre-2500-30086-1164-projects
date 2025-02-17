package pe.isil;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    /*
     * Encapsulamiento
     */
    private String nombre;
    private int edad;
    private ArrayList<Curso> cursos;

    /*
     * Constructor
     */

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        /* Inicializa */
        cursos = new ArrayList<>();
    }

    /*
     * Getters & setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void inscribirCurso(Curso curso) {
        cursos.add(curso);
    }

    public void registrarNotasFinales() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Ingrese la nota final del curso " + cursos.get(i).getNombre() + ": ");
            int nota = scanner.nextInt();
            cursos.get(i).setNota(nota);
        }
        scanner.close();
    }

    public void imprimirRegistroNotas() {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Nota final del curso " + cursos.get(i).getNombre() + ": " + cursos.get(i).getNota());
        }
    }

    private double calcularPonderado() {
        double total = 0;
        double creditos = 0;

        for (int i = 0; i < cursos.size(); i++) {
            Curso curso = cursos.get(i);
            total = total + curso.getCreditos()*curso.getNota();
            creditos = creditos + curso.getCreditos();
        }

        return total/creditos;
    }

    public void imprimirPonderado() {
        System.out.println("El ponderado final es: " + calcularPonderado());
    }
}
