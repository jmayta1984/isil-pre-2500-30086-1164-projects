package pe.isil;

public class NotificacionCorreo implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
  
}
