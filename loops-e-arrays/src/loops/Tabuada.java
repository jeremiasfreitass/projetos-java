package loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro entre 1 e 10 e será retornado a tabuada.");

        int tabuada = 0;
        int iterador = 0;
        int resultado = 0;

        Scanner scan = new Scanner(System.in);
        tabuada = scan.nextInt();
        System.out.println("Tabuada de " + tabuada);

        for(iterador = 0; iterador <= 10; iterador++){

            resultado = tabuada * iterador;

            System.out.println(tabuada + " X " + iterador + " = " + resultado);
        }

    }
}
