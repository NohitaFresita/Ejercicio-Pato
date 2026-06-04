public class PatoMallard extends Pato {

    public PatoMallard() {

        setComportamientoDeVuelo(new VolarConAlas());
        setComportamientoDeGraznido(new Quack());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato Mallard.");
    }
}