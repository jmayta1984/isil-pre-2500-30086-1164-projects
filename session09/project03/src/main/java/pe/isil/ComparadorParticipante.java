package pe.isil;

import java.util.Comparator;

public class ComparadorParticipante implements Comparator<Participante> {

    @Override
    public int compare(Participante p1, Participante p2) {
        return Double.compare(p2.getMarcaPersonal(), p1.getMarcaPersonal());
    }

}
