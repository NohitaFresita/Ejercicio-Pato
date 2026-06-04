package graznido;

public class Quack implements ComportamientoDeGraznido {

    @Override
    public void quack() {
        System.out.println("Quack Quack!");
    }
}