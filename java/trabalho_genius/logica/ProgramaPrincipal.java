package logica;

import javax.swing.JOptionPane;

import grafica.FrmGenius;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Genius logicaGenius = new Genius();
        FrmGenius frm = new FrmGenius(logicaGenius);
        frm.setVisible(true);
         int rodada = 1;
        do {
            
            JOptionPane.showMessageDialog(frm, String.format("Rodada: %s",rodada), "Genius", JOptionPane.INFORMATION_MESSAGE);
            logicaGenius.sortearCor();
            frm.animarBotoes();
            logicaGenius.limparCoresJogador();
            while(logicaGenius.isAguardandoCores()){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }

            rodada++;

        } while (logicaGenius.compararSequencias());

        JOptionPane.showMessageDialog(frm,"Perdeu, fim de jogo");
    }
}
