package pe.isil;

public class LuzInteligente implements ControlEncendido {

    @Override
    public void encender() {
        System.out.println("La luz se ha encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("La luz se ha apagado.");
    }

}
