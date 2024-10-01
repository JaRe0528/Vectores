package edu.mx.uttt.Continua1;

public class ProductoEscalar {
    private int[] vector1;
    private int[] vector2;

    public int[] getVector1() {
        return vector1;
    }

    public void setVector1(int[] vector1) {
        this.vector1 = vector1;
    }

    public int[] getVector2() {
        return vector2;
    }

    public void setVector2(int[] vector2) {
        this.vector2 = vector2;
    }

    public int calcular() {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}
