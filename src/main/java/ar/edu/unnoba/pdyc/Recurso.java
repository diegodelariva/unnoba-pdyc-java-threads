package ar.edu.unnoba.pdyc;

public class Recurso {

    String valor;
    boolean disponible = false;

    public synchronized String get() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        disponible = false;
        notifyAll();
        return valor;
    }

    public synchronized void put(String valor) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.valor = valor;
        disponible = true;
        notifyAll();
    }
}
