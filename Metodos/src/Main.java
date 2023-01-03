/*
Aplicação dos exercícios de método.
 */
public class Main {
    public static void main(String[] args) {

        // CALCULADORA
        System.out.println("\nFunções da calculadora:");

        System.out.println("\n Soma:");
        Calculadora.soma(2, 10);

        System.out.println("\n Subtrair:");
        Calculadora.subtrair(10, 5);

        System.out.println("\n Multiplicar:");
        Calculadora.multiplicar(10, 5);

        System.out.println("\n Dividir:");
        Calculadora.dividir(11, 5);


        // MENSAGEM
        System.out.println("\n\nMensagem\n");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(3);

        //EMPRÉSTIMO
        System.out.println("\n\nEmpréstimo\n");
        Emprestimo.calcular(1000.0, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);

    }


}