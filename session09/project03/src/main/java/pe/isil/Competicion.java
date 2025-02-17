package pe.isil;

import java.util.ArrayList;
import java.util.Collections;

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

    public void ordenParticipacion(){
        Collections.sort(participantes , new ComparadorParticipante());
    }
    
    
}
