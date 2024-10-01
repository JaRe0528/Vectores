package edu.mx.uttt.Continua1;

public class testProductoEscalar {
    public static void main(String[] args) {
        ProductoEscalar producto = new ProductoEscalar();

        producto.setVector1(new int[] { 1, 2, 3 });
        producto.setVector2(new int[] { 4, 5, 6 });

        int resultado = producto.calcular();

        System.out.println("Producto escalar: " + resultado);
    }
}
