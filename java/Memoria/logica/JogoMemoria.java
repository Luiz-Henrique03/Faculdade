package logica;

import java.util.Random;

import grafica.BtnPeca;

public class JogoMemoria {
    private int[][] tabuleiro;
    private int pontuacao;
    private boolean aguardandoPeça;
    private BtnPeca PeçaSelecionada;

    public JogoMemoria(){
        tabuleiro = new int[4][4];
        for(int i = 0; i  < 4; i++){
            for(int j = 0; j < 4; j++){
                tabuleiro[i][j] = sortearNumero();
            }
        }

    }

    private int sortearNumero(){
        while(true){
            int numerosorteado = new Random().nextInt(8) + 1;
            int cont = 0;
            for(int i =0; i<4; i++){
                for(int j = 0; j < 4; j++){
                    if(numerosorteado == tabuleiro[i][j]){
                        cont++;
                    }
                }
            }
            if(cont < 2){
                return numerosorteado;
            }
        }
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void aumentarPontuacao(){
        pontuacao += 5;
    }

    public void diminuirPontuacao(){
        pontuacao -= 3;
    }


    public boolean isAguardandoPeça() {
        return aguardandoPeça;
    }

    public void setAguardandoPeça(boolean aguardandoPeça) {
        this.aguardandoPeça = aguardandoPeça;
    }

  public void setPeçaSelecionada(BtnPeca peçaSelecionada) {
      PeçaSelecionada = peçaSelecionada;
  }

  public BtnPeca getPeçaSelecionada() {
      return PeçaSelecionada;
  }
}
