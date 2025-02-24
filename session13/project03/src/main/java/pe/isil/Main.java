package pe.isil;

public class Main {
    public static void main(String[] args) {
       Notificador notificador = new Notificador();
       notificador.enviarNotificacion(new NotificacionCorreo(), "Hola. Te enviamos un correo.");
       notificador.enviarNotificacion(new NotificacionSMS(), "Tu código de verificación es 1234");
       notificador.enviarNotificacion(new NotificacionWhatsApp(), "Hola. Tiene un crédito preaprobado.");
    }
}