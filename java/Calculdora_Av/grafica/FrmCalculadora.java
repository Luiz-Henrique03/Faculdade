package grafica;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Dimension;

public class FrmCalculadora extends JFrame{
    private JTextField txtX,txtY;
    private JComboBox cbxOperacao;

    public FrmCalculadora(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new JLabel("X:"));
        add(txtX = new JTextField(10));
        add(new JLabel("Y:"));
        add(txtY = new JTextField(10));
        add(new JLabel("Operação:"));
        String[] operacao = {"Soma","Subtração","Multiplicação","Divisão"};
        add(cbxOperacao = new JComboBox<String>(operacao));
        JButton btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        setSize(new Dimension(300,130));

        ActionCalcular action = new ActionCalcular(txtX, txtY, cbxOperacao);
        btnCalcular.addActionListener(action);
    }
}