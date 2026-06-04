public class PatoDeHule extends Pato {

    public PatoDeHule() {

        setComportamientoDeVuelo(new SinVuelo());
        setComportamientoDeGraznido(new Chillido());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato de Hule.");
    }
}