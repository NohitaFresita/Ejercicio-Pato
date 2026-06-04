package patos;
import graznido.Chillido;
import vuelo.SinVuelo;

public class PatoDeHule extends Pato {

    public PatoDeHule() {

        establecerComportamientoDeVuelo(new SinVuelo());
        establecerComportamientoDeGraznido(new Chillido());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato de Hule.");
    }
}