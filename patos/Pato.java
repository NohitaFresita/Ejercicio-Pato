public abstract class Pato {

    private ComportamientoDeVuelo comportamientoDeVuelo;
    private ComportamientoDeGraznido comportamientoDeGraznido;

    public void nadar() {
        System.out.println("El pato está nadando.");
    }

    public void realizarVuelo() {
        comportamientoDeVuelo.volar();
    }

    public void realizarGraznido() {
        comportamientoDeGraznido.graznar();
    }

    public void setComportamientoDeVuelo(
            ComportamientoDeVuelo comportamientoDeVuelo) {

        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public void setComportamientoDeGraznido(
            ComportamientoDeGraznido comportamientoDeGraznido) {

        this.comportamientoDeGraznido = comportamientoDeGraznido;
    }

    public abstract void dibujar();
}