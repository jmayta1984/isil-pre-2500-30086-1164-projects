package pe.isil;

public class Notificador {
    public void enviarCorreo(String mensaje) {
    }
    
    public void enviarSMS(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }

    public void enviarWhatsApp(String mensaje) {
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
}
