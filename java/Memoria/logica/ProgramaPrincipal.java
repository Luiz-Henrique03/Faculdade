package logica;

import grafica.FrmMemoria;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        FrmMemoria frm = new FrmMemoria();
        frm.setVisible(true);
        frm.mostrarTabuleiro();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        frm.ocultarTabuleiro();
    }

}
