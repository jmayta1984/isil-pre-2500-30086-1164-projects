package pe.isil;

public class ReporteExcel implements Reporte {

    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en Excel: " + datos);
    }

}
