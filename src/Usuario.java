public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        /* Chamando novos Métodos */
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        /* Mudar de Canal */

        smartTv.mudarCanal(39); /* <- Insira o novo canal Aqui */
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
    }
}
