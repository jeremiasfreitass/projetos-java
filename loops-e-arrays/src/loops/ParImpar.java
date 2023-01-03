package loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        System.out.println("Programa com objetivo de receber n números e retornar a quantidade dos pares e ímpares.");

        int quantNumeros = 0;
        int numero = 0;
        int par = 0;
        int impar = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que deseja comparar: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0)  par++;
            else impar++;

            count++;
        }while (count < quantNumeros);

        System.out.println("Foram digitados " + par + " números pares e " + impar + " números ímpares");
    }
}
