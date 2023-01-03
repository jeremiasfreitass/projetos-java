package arrays;

import java.util.Scanner;

/*
Projeto que executa a leitura de um vetor com 6 caracteres,
e retorna quantas consoantes foram lidas.
 */
public class Consoantes {
    public static void main(String[] args) {

        int quantidadeConsoantes = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];

        System.out.println("Digite uma letra por vez: ");
        do {
            System.out.println("Letra:");
            String letra = scan.next();


            if (!(letra.equalsIgnoreCase ("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;

        }while (count < consoantes.length);

        if(quantidadeConsoantes > 0){
            System.out.println("Foram identificadas as consoantes abaixo:");
        }else{
            System.out.println("Não foram identificadas consoantes.");
        }

        for ( String consoante : consoantes ) {

            if(consoante != null ) System.out.print(consoante + " ");

        }
    }
}
