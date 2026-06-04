public class Main {

    public static void main(String[] args) {

        Pato pato1 = new PatoMallard();

        pato1.dibujar();
        pato1.nadar();
        pato1.realizarVuelo();
        pato1.realizarGraznido();

        System.out.println();

        Pato pato2 = new PatoDeHule();

        pato2.dibujar();
        pato2.nadar();
        pato2.realizarVuelo();
        pato2.realizarGraznido();
    }
}