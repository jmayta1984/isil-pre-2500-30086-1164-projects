package pe.isil;

public class Termostato implements ControlTemperatura {

    @Override
    public void ajustarTemperatura(int temperatura) {
        System.out.println("Temperatura ajustada a: " + temperatura);
    }

    @Override
    public void encender() {
        System.out.println("El termostato está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El termostato está apagado.");
    }

}
