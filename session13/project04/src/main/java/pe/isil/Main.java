package pe.isil;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte generador = new GeneradorReporte();
        generador.generarReporte(new ReportePDF(), "Nueva cotización.");
        generador.generarReporte(new ReporteExcel(), "Datos de las ventas del mes.");

    }
}