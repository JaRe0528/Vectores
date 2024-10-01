package edu.mx.uttt.Continua1;

public class InvertirVector {
    private int[] vector;

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int[] invertir() {
        int[] invertido = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            invertido[i] = vector[vector.length - 1 - i];
        }
        return invertido;
    }
}
