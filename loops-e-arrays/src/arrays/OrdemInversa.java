package arrays;
/*
Criar um vetor com 6 números inteiros
e mostrar a ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5};
        int count = 0;

        System.out.println("Posições do vetor");

        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nPosições inversas do vetor");
        for (int i = (vetor.length-1); i >= 0; i-- ){
            System.out.print(vetor[i] + " ");
        }
    }
}
