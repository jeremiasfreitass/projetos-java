public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status da TV: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status da Tv: " + smartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(smartTv.canalEscolhido);
        System.out.println("Canal atual: "+ smartTv.canal);


            int numero1 = 1;
            String numero2 = "2";
            System.out.println(numero1+numero2);
        }
}