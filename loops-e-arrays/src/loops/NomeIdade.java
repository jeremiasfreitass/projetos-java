package loops;

import java.util.Scanner;

//Programa capta através de um loop as informações de nome e idade.
//É finalizado apenas quando se preenche no campo nome o número "0".

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;


        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0"))break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
    }
}
