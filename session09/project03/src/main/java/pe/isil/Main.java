package pe.isil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Evento deportivo");

        int cantidad;
        Scanner scanner = new Scanner(System.in);
        Competicion competicion = new Competicion();

        System.out.print("Ingrese la cantidad de participantes: ");
        cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("-----------");
            System.out.println("Datos del participante " + (i + 1));

            System.out.println("Ingrese el número de camiseta: ");
            int camiseta = scanner.nextInt();

            System.out.println("Ingrese el nombre del participante: ");
            String nombre = scanner.next();

            System.out.println("Ingrese la marca personal: ");
            double marcaPersonal = scanner.nextDouble();

            Participante participante = new Participante(camiseta, nombre, marcaPersonal);
            competicion.inscribirParticipante(participante);
        }
        scanner.close();
        System.out.println(competicion.getParticipantes());

        competicion.ordenParticipacion();
        System.out.println(competicion.getParticipantes());



    }
}