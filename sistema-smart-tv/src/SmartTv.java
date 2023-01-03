public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    int canalEscolhido = 152;


    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int canalEscolhido){
       canal = canalEscolhido;

    }
}
