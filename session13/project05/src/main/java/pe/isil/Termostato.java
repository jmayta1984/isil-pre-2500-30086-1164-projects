package pe.isil;

public class Termostato implements ControlEncendido, ControlTemperatura {

    @Override
    public void ajustarTemperatura() {
        
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
