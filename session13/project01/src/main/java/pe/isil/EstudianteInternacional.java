package pe.isil;

public class EstudianteInternacional extends Estudiante {
    private String pais;

    public EstudianteInternacional(String nombre, int edad, String dni, String carrera, String pais) {
        super(nombre, edad, dni, carrera);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + " / pais - " + pais;
    }

    
}
