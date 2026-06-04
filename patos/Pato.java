package patos;

import graznido.ComportamientoDeGraznido;
import vuelo.ComportamientoDeVuelo;

public abstract class Pato {

    private ComportamientoDeVuelo comportamientoDeVuelo;
    private ComportamientoDeGraznido comportamientoDeGraznido;

    public void nadar() {
        System.out.println("El pato está nadando.");
    }

    public void emprenderVuelo() {
        comportamientoDeVuelo.volar();
    }

    public void hacerQuack() {
        comportamientoDeGraznido.quack();
    }

    protected void establecerComportamientoDeVuelo(
            ComportamientoDeVuelo comportamientoDeVuelo) {

        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    protected void establecerComportamientoDeGraznido(
            ComportamientoDeGraznido comportamientoDeGraznido) {

        this.comportamientoDeGraznido = comportamientoDeGraznido;
    }

    public abstract void dibujar();
}