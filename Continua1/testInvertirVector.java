package edu.mx.uttt.Continua1;

public class testInvertirVector {
    public static void main(String[] args) {
        InvertirVector inversion = new InvertirVector();

        inversion.setVector(new int[]{1, 2, 3, 4, 5});

        int[] resultado = inversion.invertir();

        System.out.println("Vector invertido:");
        for (int i : resultado) {
            System.out.print(i + " ");
        }
    }
}
