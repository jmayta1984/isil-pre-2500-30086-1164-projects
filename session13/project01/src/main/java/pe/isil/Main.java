package pe.isil;

public class Main {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Luis", 25, "456789123");
        System.out.println(persona.toString());

        Persona estudiante = new Estudiante("Ana", 20, "457845612", "Sistemas");
        System.out.println(estudiante.toString());

        Persona profesor = new Profesor("Jorge", 40, "45678913", "Informática");
        System.out.println(profesor.toString());

        Estudiante estudianteInternacional = new EstudianteInternacional("Matias", 25, "45679874", "Diseño", "España");
        System.out.println(estudianteInternacional.toString());
        estudianteInternacional.estudiar();

    }
}