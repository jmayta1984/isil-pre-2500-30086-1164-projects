package pe.isil;

public class PagoTransferencia implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago mediante transferencia");
    }

}
