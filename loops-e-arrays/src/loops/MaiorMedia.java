package loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        double soma = 0;
        double media = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma = soma+numero;

            if(numero > maior) maior = numero;

            count++;
        } while (count < 5);

        media = soma/count;

        System.out.println("O maior numero digitado foi: " + maior);

        System.out.println("A média dos números digitados foi: " + media);

        //System.out.println("Digite 5 números: ");
        //numero = scan.nextInt();
    }
}
