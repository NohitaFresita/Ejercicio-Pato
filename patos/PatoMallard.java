package patos;

import graznido.Quack;
import vuelo.VolarConAlas;

public class PatoMallard extends Pato {

    public PatoMallard() {

        establecerComportamientoDeVuelo(new VolarConAlas());
        establecerComportamientoDeGraznido(new Quack());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mallard.");
    }
}