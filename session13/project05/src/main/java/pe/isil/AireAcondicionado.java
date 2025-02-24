package pe.isil;

public class AireAcondicionado implements ControlTemperatura {

    @Override
    public void encender() {
        System.out.println("Aire acondicionado prendido.");
    }

    @Override
    public void apagar() {
        System.out.println("Aire acondicionado apagado.");
    }

    @Override
    public void ajustarTemperatura(int temperatura) {
        System.out.println("Temperatura ajustada a: " + temperatura);
    }

}
