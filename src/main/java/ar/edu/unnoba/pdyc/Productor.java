package ar.edu.unnoba.pdyc;

public class Productor extends Thread {

    private String letra;
    private Recurso recurso;

    public Productor(String letra, Recurso recurso) {
        super();
        this.letra = letra;
        this.recurso = recurso;
    }

    @Override
    public void run() {
        for (int i = 0; i< 3; i++) {
            String valor = letra + ": " + i;
            System.out.println(valor);
            recurso.put(valor);
            try {
                sleep(100)  ;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
