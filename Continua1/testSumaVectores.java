package edu.mx.uttt.Continua1;

public class testSumaVectores {
    public static void main(String[] args) {
        SumaVectores suma = new SumaVectores();

        suma.setTamaño(3);

        int[] vector1 = { 1, 2, 3 };
        int[] vector2 = { 4, 5, 6 };

        suma.setV1(vector1);
        suma.setV2(vector2);

        int[] resultado = suma.sumar();

        System.out.println("Resultado de la suma de los vectores:");
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }
}
