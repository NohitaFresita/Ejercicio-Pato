package principal;

import patos.Pato;
import patos.PatoDeHule;
import patos.PatoMallard;


public class Main {

    public static void main(String[] args) {

        Pato pato1 = new PatoMallard();

        pato1.dibujar();
        pato1.nadar();
        pato1.emprenderVuelo();
        pato1.hacerQuack();

        System.out.println();

        Pato pato2 = new PatoDeHule();

        pato2.dibujar();
        pato2.nadar();
        pato2.emprenderVuelo();
        pato2.hacerQuack();
    }
}