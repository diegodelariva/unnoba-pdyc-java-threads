package ar.edu.unnoba.pdyc;

public class Main {
    public static void main(String[] args) {

        Recurso recurso = new Recurso();
        //instanciación
        Productor miThread1 = new Productor("Prod1",recurso);
        Productor miThread2 = new Productor("Prod2",recurso);
        Productor miThread3 = new Productor("Prod3",recurso);
        Productor miThread4 = new Productor("Prod4",recurso);
        Consumidor consumidor1 = new Consumidor("Cons1",recurso);
        Consumidor consumidor2 = new Consumidor("Cons2",recurso);
        Consumidor consumidor3 = new Consumidor("Cons3",recurso);

        //ejecución
        miThread1.start();
        miThread2.start();
        miThread3.start();
        miThread4.start();
        consumidor1.start();
        consumidor2.start();
        consumidor3.start();


    }
}
