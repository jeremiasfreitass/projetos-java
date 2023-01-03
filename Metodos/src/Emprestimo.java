/*
Efetuar o calculo de um empréstimo recebendo um valor e numero de parcelas.
Ter a possibilidade de 2 casos de divisão com taxas distintas.
Retornar valor final calculado com juros.
 */

public class Emprestimo {
    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final para o empréstimo de R$ " + valor + ", parcelado em 2 vezes, é igual a R$ " + valorFinal);
        }else if(parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final para o empréstimo de R$ " + valor + ", parcelado em 3 vezes, é igual a R$ " + valorFinal);
        }else{
            System.out.println("A quantidade de parcelas: " +parcelas+ " não é válida.");
        }
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }
}
