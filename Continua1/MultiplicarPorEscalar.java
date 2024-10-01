package edu.mx.uttt.Continua1;

public class MultiplicarPorEscalar {
    public static void main(String[] args) {
        MultiplicarPorEscala multiplicacion = new MultiplicarPorEscala();

        multiplicacion.setVector(new int[] { 1, 2, 3, 4 });
        multiplicacion.setEscalar(3);

        int[] resultado = multiplicacion.multiplicar();

        System.out.println("Vector multiplicado por " + multiplicacion.getEscalar() + ":");
        for (int i : resultado) {
            System.out.print(i + " ");
        }
    }
}