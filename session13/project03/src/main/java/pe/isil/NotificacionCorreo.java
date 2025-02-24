package pe.isil;

public class NotificacionCorreo implements NotificacionConAdjunto {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }

    @Override
    public void adjuntarArchivo(String archivo) {
        System.out.println("Adjunto: " + archivo);
    }

}
