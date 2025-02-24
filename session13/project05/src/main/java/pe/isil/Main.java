package pe.isil;

public class Main {
    public static void main(String[] args) {
        ControlEncendido luz = new LuzInteligente();
        ControlEncendido camara = new CamaraSeguridad();
        ControlEncendido aireAcondicionado = new AireAcondicionado();

        // Probando dispositivos
        luz.encender();
        camara.apagar();

        ((ControlTemperatura) aireAcondicionado).ajustarTemperatura(20);
    }
}