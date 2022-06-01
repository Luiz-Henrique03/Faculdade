package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import logica.JogoMemoria;

public class ActionConferir extends AbstractAction{
    private BtnPeca[][] tabuleiro;
    private JogoMemoria jogo;
     int Total;

    public ActionConferir(BtnPeca[][] tabuleiro, JogoMemoria jogo){
        this.tabuleiro = tabuleiro;
        this.jogo = jogo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BtnPeca btn = (BtnPeca) e.getSource();
        int numero = btn.getNumero();
        if(jogo.isAguardandoPeça()){
            if(numero == jogo.getPeçaSelecionada().getNumero()){
                jogo.aumentarPontuacao();
                jogo.setAguardandoPeça(false);
                btn.mostrar();
                if(VerificaFim()){
                    JOptionPane.showMessageDialog(null, String.format("Pontuação de %d",jogo.getPontuacao()),"Fim de jogo",JOptionPane.INFORMATION_MESSAGE);
                }
                btn.setEnabled(false);
                jogo.getPeçaSelecionada().setEnabled(false);
            }else{
                 jogo.diminuirPontuacao();
                 jogo.setAguardandoPeça(false);
                 btn.ocultar();
                 jogo.getPeçaSelecionada().ocultar();
            }
        }else{
            jogo.setPeçaSelecionada(btn);
            jogo.setAguardandoPeça(true);
            btn.mostrar();
        }
    }
    private boolean VerificaFim(){
        int cont = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <4; j++){     
               if(tabuleiro[i][j].isSelected()){
                   cont++;
               }             
            }
        }
        if(cont == 16){
            return true;
        }else{
            return false;
        }
    }
}
