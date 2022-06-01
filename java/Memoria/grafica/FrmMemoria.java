package grafica;

import javax.swing.JFrame;

import logica.JogoMemoria;

import java.awt.Dimension;
import java.awt.GridLayout;

public class FrmMemoria extends JFrame{
      
    BtnPeca[][] tabuleiro;
    JogoMemoria jogo;

      public FrmMemoria(){
         tabuleiro = new BtnPeca[4][4];
         jogo = new JogoMemoria();
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setLayout(new GridLayout(4,4,10,10));
         carregarpeças();
         setSize(new Dimension(300,300));
      }

      private void carregarpeças(){

        ActionConferir action = new ActionConferir(tabuleiro, jogo);

          for(int i = 0; i < 4; i++){
              for(int j = 0; j <4; j++){
                  int numerosorteado = jogo.getTabuleiro()[i][j];
                  BtnPeca btn = new BtnPeca(numerosorteado);
                  tabuleiro[i][j] = btn;
                  add(btn);
                  btn.addActionListener(action);
              }
          }
      }

      public void mostrarTabuleiro(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <4; j++){     
                tabuleiro[i][j].mostrar();             
            }
        }
    }

    
    public void ocultarTabuleiro(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <4; j++){     
                tabuleiro[i][j].ocultar();             
            }
        }
    }


} 