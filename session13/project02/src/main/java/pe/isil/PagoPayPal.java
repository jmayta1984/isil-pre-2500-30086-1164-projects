package pe.isil;

public class PagoPayPal implements Pago {

    private String correo;

    public PagoPayPal(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /* 
     * Implementar los métodos de la interfaz
     */
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago de la cuenta " + correo);

    }

}
