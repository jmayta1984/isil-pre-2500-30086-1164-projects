package pe.isil;

public class Main {
    public static void main(String[] args) {

    
        Pago pagoTarjeta = new PagoTarjeta("5468568", "Pedro");

        ProcesadorPago procesador = new ProcesadorPago(pagoTarjeta);
        procesador.procesarPago(100);


        Pago pagoPayPal = new PagoPayPal("lfuentes@gmail.com");
        procesador.setPago(pagoPayPal);
        procesador.procesarPago(50);

        Pago pagoTransferencia = new PagoTransferencia();
        procesador.setPago(pagoTransferencia);
        procesador.procesarPago(70);
        
    }
}