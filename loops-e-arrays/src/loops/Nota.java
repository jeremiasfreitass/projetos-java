package loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (true) {

            if(nota > 10 || nota < 0) {
                System.out.println("Nota inválida!");
            }else{
                System.out.println("Nota válida!");
                break;
            }
            System.out.println("Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
