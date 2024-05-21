public class Usuario {
     public static void main(String[] args) {
          
          SmartTv smartTV = new SmartTv();

          System.out.println("Tv está ligada? " + smartTV.ligada);
          System.out.println("O canal ligado é: " + smartTV.canal);
          System.out.println("Qual o volume atual? " + smartTV.volume);

          smartTV.diminuirVolume();
          smartTV.diminuirVolume();
          smartTV.diminuirVolume();
          smartTV.aumentarVolume();
          smartTV.mudarCanal(10);

          System.out.println("Tv está ligada? " + smartTV.ligada);
          System.out.println("O canal ligado é: " + smartTV.canal);
          System.out.println("Qual o volume atual? " + smartTV.volume);

     }
}
