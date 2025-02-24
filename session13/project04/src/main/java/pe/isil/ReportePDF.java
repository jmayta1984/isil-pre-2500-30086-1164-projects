package pe.isil;

public class ReportePDF implements Reporte {

    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en PDF: " + datos);
    }

}
