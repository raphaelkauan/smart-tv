public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  /* Criando o Método ligar */
  public void ligar() {
    ligada = true;
  }

  /* Criando o Método desligar */
  public void desligar() {
    ligada = false;
  }

  /* Criando Método para Mudar de Canal */
  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void aumentarCanal() {
    canal--;
  }

  public void diminuirCanal() {
    canal++;
  }

  /* Criando o Métodos para o Volume */
  public void aumentarVolume() {
    /* volume = volume +1 */
    volume++;
  }

  public void diminuirVolume() {
    volume--;
  }
}

