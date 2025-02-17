package pe.isil;

public class Participante {

    /*
     * Encapsulamiento
     */
    private int camiseta;
    private String nombre;
    private double marcaPersonal;
    private double marcaPrueba;

    /*
     * Constructor
     */
    public Participante(int camiseta, String nombre, double marcaPersonal) {
        this.camiseta = camiseta;
        this.nombre = nombre;
        this.marcaPersonal = marcaPersonal;
        this.marcaPrueba = 0;
    }

    /*
     * Getters & setters
     */
    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMarcaPersonal() {
        return marcaPersonal;
    }

    public void setMarcaPersonal(double marcaPersonal) {
        this.marcaPersonal = marcaPersonal;
    }

    public double getMarcaPrueba() {
        return marcaPrueba;
    }

    public void setMarcaPrueba(double marcaPrueba) {
        this.marcaPrueba = marcaPrueba;
    }
    
    @Override
    public String toString() {
        return "{Nombre: "+nombre + " | Marca personal: " + marcaPersonal +"}";
    }


}
