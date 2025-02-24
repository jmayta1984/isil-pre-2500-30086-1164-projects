package pe.isil;

// Interfaz para dispositivos de seguridad
public interface Seguridad extends ControlEncendido {
    public void grabarVideo();
    public void enviarAlerta();
}
