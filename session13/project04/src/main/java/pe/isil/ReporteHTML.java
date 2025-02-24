package pe.isil;

public class ReporteHTML implements Reporte {

    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en HTML: " + datos);
    }


}
