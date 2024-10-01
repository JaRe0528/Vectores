package edu.mx.uttt.Continua1;

public class SumaVectores {
    private int[] v1;
    private int[] v2;
    private int tamaño;

    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        if (v1.length == tamaño) {
            this.v1 = new int[tamaño];
            for (int i = 0; i < v1.length; i++) {
                this.v1[i] = v1[i];
            }
        }
    }

    public int[] getV2() {
        return v2;
    }

    public void setV2(int[] v2) {
        if (v2.length == tamaño) {
            this.v2 = new int[tamaño];
            for (int i = 0; i < v2.length; i++) {
                this.v2[i] = v2[i];
            }
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        this.v1 = new int[tamaño];
        this.v2 = new int[tamaño];
    }

    public int[] sumar() {
        int[] resultado = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }
}
