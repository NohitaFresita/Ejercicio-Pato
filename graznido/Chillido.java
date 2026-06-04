package graznido;

public class Chillido implements ComportamientoDeGraznido {

    @Override
    public void quack() {
        System.out.println("Piiii Piiii!");
    }
}