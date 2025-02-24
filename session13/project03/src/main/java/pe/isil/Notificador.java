package pe.isil;

public class Notificador {

    public void enviarNotificacion(Notificacion notificacion, String mensaje) {
        notificacion.enviar(mensaje);
    }
}
