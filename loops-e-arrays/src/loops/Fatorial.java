package loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro e retornará o fatorial.");

        int numero;
        int multiplicacao = 1;

        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();

        for (int i = numero; i >=1; i--){

            multiplicacao = multiplicacao * i;

        }

        System.out.println("O fatorial de " + numero + " é " + multiplicacao);
    }
}
