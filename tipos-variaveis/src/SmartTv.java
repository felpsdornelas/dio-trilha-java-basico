public class SmartTv {
     boolean ligada = true;
     int canal = 1;
     int volume = 25;

     public void ligar(){
          ligada = true; 
     }

     public void desligar (){
          ligada = false;
     }

     public void aumentarVolume (){
          volume++;
          System.out.println("Aumentando o volume em: " + volume);
     }

     public void diminuirVolume (){
          volume--;
          System.out.println("Diminuindo o volume em: " + volume);
     }

     public void mudarCanal (int novoCanal){
          canal = novoCanal;
          System.out.println("Mudança de canal, para o canal: " + novoCanal);
     }
}
