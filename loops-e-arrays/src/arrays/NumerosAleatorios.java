package arrays;

import java.util.Random;
/*
Programa que le 20 numeros aleatorios (entre 0 e 100) e armazena-os num vetor.
Por fim, imprime os antecessores e sucessores de cada numero.
 */

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("\nNumeros aleatorios:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nSucessores dos numeros aleatorios:");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\n\nAntecessor dos numeros aleatorios:");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
