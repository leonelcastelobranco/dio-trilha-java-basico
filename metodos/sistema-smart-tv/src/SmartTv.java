public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void dimiunirCanal(){
        canal --;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentar o volume para: " + volume);
    }

    public void dimiunirVolume(){
        volume --;
        System.out.println("Diminuior o volume para: " + volume); 
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
        
}
    
