package pe.isil;

public class Curso {
    /*
     * Encapsulamiento
     */

    private String nombre;
    private String codigo;
    private double creditos;
    private double nota;

    /*
     * Constructor
     */
    public Curso(String nombre, String codigo, double creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        nota = 0;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}