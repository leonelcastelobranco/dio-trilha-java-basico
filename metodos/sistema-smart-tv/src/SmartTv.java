public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

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
    
