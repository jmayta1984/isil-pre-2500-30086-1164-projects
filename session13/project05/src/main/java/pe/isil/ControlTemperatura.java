package pe.isil;

// Interfaz para dispositivos que ajustan temperatura
public interface ControlTemperatura extends ControlEncendido {
    public void ajustarTemperatura(int temperatura);
}
