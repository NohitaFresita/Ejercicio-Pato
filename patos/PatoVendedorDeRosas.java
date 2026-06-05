package patos;

import graznido.Quack;
import vuelo.VueloPsicodelico;

public class PatoVendedorDeRosas extends Pato {

    public PatoVendedorDeRosas() {

        establecerComportamientoDeVuelo(new VueloPsicodelico());
        establecerComportamientoDeGraznido(new Quack());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato vendedor de rosas, solo sople");
    }
}