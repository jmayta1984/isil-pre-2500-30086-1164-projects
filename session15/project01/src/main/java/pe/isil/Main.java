package pe.isil;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto();
        Vehiculo camion = new Camion();

        auto.mover();
        camion.mover();
    }
}