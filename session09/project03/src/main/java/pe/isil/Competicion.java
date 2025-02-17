package pe.isil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Competicion {
    private ArrayList<Participante> participantes;

    public Competicion() {
        participantes = new ArrayList<>();
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void inscribirParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void ordenParticipacion() {
        Collections.sort(participantes, new ComparadorParticipante());
    }

    public void pruebaParticipacion() {
        Scanner scanner = new Scanner(System.in);

        for (Participante participante : participantes) {
            System.out.println("Ingrese la marca obtenida para el participante " + participante.getNombre() + ":");
            participante.setMarcaPrueba(scanner.nextDouble());
        }
        scanner.close();
    }

    public List<Participante> mejorMarcaPersonal(){
        List<Participante> mejorMarca = new ArrayList<>();

        for (Participante participante : participantes) {
            if (participante.getMarcaPersonal() > participante.getMarcaPrueba()) {
                mejorMarca.add(participante);
            }
        }
        return mejorMarca;
    }

}
