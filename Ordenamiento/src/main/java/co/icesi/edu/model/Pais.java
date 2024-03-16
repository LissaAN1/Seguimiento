package co.icesi.edu.model;

public class Pais implements Comparable<Pais> {
    String nombre;
    int oroMasculino, plataMasculino, bronceMasculino;
    int oroFemenino, plataFemenino, bronceFemenino;

    public Pais(String nombre, int oroMasculino, int plataMasculino, int bronceMasculino,
                int oroFemenino, int plataFemenino, int bronceFemenino) {
        this.nombre = nombre;
        this.oroMasculino = oroMasculino;
        this.plataMasculino = plataMasculino;
        this.bronceMasculino = bronceMasculino;
        this.oroFemenino = oroFemenino;
        this.plataFemenino = plataFemenino;
        this.bronceFemenino = bronceFemenino;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPlataMasculino() {
        return plataMasculino;
    }

    public int getBronceFemenino() {
        return bronceFemenino;
    }

    public int getPlataFemenino() {
        return plataFemenino;
    }

    public int getOroFemenino() {
        return oroFemenino;
    }

    public int getBronceMasculino() {
        return bronceMasculino;
    }

    public int getOroMasculino() {
        return oroMasculino;
    }

    @Override
    public int compareTo(Pais otro) {
        if (this.oroFemenino != otro.oroFemenino)
            return Integer.compare(this.oroFemenino, otro.oroFemenino);
        if (this.plataFemenino != otro.plataFemenino)
            return Integer.compare(this.plataFemenino, otro.plataFemenino);
        if (this.bronceFemenino != otro.bronceFemenino)
            return Integer.compare(this.bronceFemenino, otro.bronceFemenino);
        return this.nombre.compareTo(otro.nombre);
    }
}

