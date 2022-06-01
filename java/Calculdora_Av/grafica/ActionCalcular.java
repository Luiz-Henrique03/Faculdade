package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionCalcular extends AbstractAction{
    private JTextField txtX,txtY;
    private JComboBox<String> cbxOperacao;
    public ActionCalcular(JTextField txtX, JTextField txtY, JComboBox<String>cbxOperacao){
        this.txtX = txtX;
        this.txtY = txtY;
        this.cbxOperacao = cbxOperacao;
    }   
 
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double x = Double.parseDouble(txtX.getText());
            double y = Double.parseDouble(txtY.getText());
            double resultado;
            String operacao = cbxOperacao.getSelectedItem().toString();
            if(operacao.equals("Soma")){
                resultado = x + y;
                JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f + %.2f = %.2f", x,y,resultado), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            }else if(operacao.equals("Subtração")){
                resultado = x - y;
                JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f - %.2f = %.2f", x,y,resultado), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            }else if(operacao.equals("Multiplicação")){
                resultado = x * y;
                JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f X %.2f = %.2f", x,y,resultado), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            }else{
                resultado = x / y;
                JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f X %.2f = %.2f", x,y,resultado), "Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Número invalido","Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
