package logica;

import javax.swing.JOptionPane;

import grafica.FrmGenius;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Genius logicaGenius = new Genius();
        FrmGenius frm = new FrmGenius(logicaGenius);
        frm.setVisible(true);
       do{ 
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

         logicaGenius.getCoresSorteadas().clear();
       }while( JOptionPane.showOptionDialog(frm,"Deseja Continuar","Genius",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null) == JOptionPane.YES_OPTION);

        frm.setVisible(false);
        frm.dispose();
    }
}
