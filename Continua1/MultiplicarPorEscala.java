package edu.mx.uttt.Continua1;

public class MultiplicarPorEscala {
    private int[] vector;
    private int escalar;

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getEscalar() {
        return escalar;
    }

    public void setEscalar(int escalar) {
        this.escalar = escalar;
    }

    public int[] multiplicar() {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }
}
