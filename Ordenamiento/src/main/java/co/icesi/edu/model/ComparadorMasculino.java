package co.icesi.edu.model;

import java.util.Comparator;

public class ComparadorMasculino implements Comparator<Pais> {
    @Override
    public int compare(Pais pais1, Pais pais2) {
        if (pais1.oroMasculino != pais2.oroMasculino)
            return Integer.compare(pais2.oroMasculino, pais1.oroMasculino);
        if (pais1.plataMasculino != pais2.plataMasculino)
            return Integer.compare(pais2.plataMasculino, pais1.plataMasculino);
        if (pais1.bronceMasculino != pais2.bronceMasculino)
            return Integer.compare(pais2.bronceMasculino, pais1.bronceMasculino);
        return pais1.nombre.compareTo(pais2.nombre);
    }
}
