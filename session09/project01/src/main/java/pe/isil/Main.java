package pe.isil;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Andrea Grados", 21);

        estudiante.inscribirCurso(new Curso("Desarrollo de aplicaciones web", "SI324", 4.0));
        estudiante.inscribirCurso(new Curso("Desarrollo de aplicaciones Android", "SI325", 4.5));
        estudiante.inscribirCurso(new Curso("Desarrollo de aplicaciones iOS", "SI326", 4.5));

        estudiante.registrarNotasFinales();
        estudiante.imprimirRegistroNotas();

        estudiante.imprimirPonderado();
        
    }
}