package ar.edu.unnoba.pdyc;

public class Consumidor extends Thread {

    private String letra;
    private Recurso recurso;

    public Consumidor(String letra, Recurso recurso) {
        super();
        this.letra = letra;
        this.recurso = recurso;
    }

    @Override
    public void run() {
        for (int i = 0; i< 4; i++) {
            System.out.println(letra + " " + recurso.get());
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
