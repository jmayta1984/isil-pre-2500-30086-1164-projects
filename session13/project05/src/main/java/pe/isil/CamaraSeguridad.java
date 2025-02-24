package pe.isil;

public class CamaraSeguridad implements Seguridad {

    @Override
    public void grabarVideo() {
        System.out.println("Grabando video");
    }

    @Override
    public void enviarAlerta() {
        System.out.println("¡Alerta!");
    }

    @Override
    public void encender() {
        System.out.println("Cámara de seguridad prendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Cámara de seguridad apagada.");

    }

}
