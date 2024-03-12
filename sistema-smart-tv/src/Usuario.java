public class Usuario {
    
    public static void main(String[]args) throws Exception{

        SmartTv smartTv = new SmartTv();

    
        System.out.println("A tv está ?: "+smartTv.ligada);
        System.out.println("Canal atual ? "+smartTv.canal);
        System.out.println("Volume atual ? "+smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status -> A tv está ?: "+smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> A tv está ?: "+smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual da Tv: "+smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual da Tv: "+smartTv.volume);

        smartTv.mudarCamal(13);
        System.out.println("Novo Canal Informado "+smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Canal Informado "+smartTv.canal);



        
        



    }
}
