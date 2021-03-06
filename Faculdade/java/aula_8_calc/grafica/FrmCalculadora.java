package grafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.Calculadora;
import logica.Calculadora.Operacao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmCalculadora extends JFrame {
    private JTextField txtDisplay;
    private Calculadora calc;

    public FrmCalculadora() {

        this.calc = new Calculadora();

        setLayout(new BorderLayout());

        JPanel pnlNorte = new JPanel(new BorderLayout());
        this.add(pnlNorte, BorderLayout.NORTH);
        this.txtDisplay = new JTextField();
        pnlNorte.add(txtDisplay, BorderLayout.CENTER);

        JPanel pnlCentro = new JPanel(new GridLayout(5, 4, 5, 5));
        this.add(pnlCentro, BorderLayout.CENTER);

        JButton btn = new JButton("C");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
                calc.setAguardando(false);
                calc.setOperando1(0.0d);
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("*");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                calc.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calc.setOperacao(Operacao.MULTIPLICACAO);
                txtDisplay.setText("");
                calc.setAguardando(true);
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("<html>a <sup>b</sup> </html>");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                calc.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calc.setOperacao(Operacao.POTENCIA);
                txtDisplay.setText("");
                calc.setAguardando(true);
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("<");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                if (txtAntigo.length() > 0) {
                    txtDisplay.setText(txtAntigo.substring(0, txtAntigo.length() - 1));
                }
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("7");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("7"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("8");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("8"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("9");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("9"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("/");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                calc.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calc.setOperacao(Operacao.DIVISAO);
                txtDisplay.setText("");
                calc.setAguardando(true);
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("4");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("4"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("5");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("5"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("6");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("6"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("+");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                calc.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calc.setOperacao(Operacao.SOMA);
                txtDisplay.setText("");
                calc.setAguardando(true);
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("1");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("1"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("2");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("2"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("3");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("3"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("-");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                calc.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calc.setOperacao(Operacao.SUBTRACAO);
                calc.setAguardando(true);
                txtDisplay.setText("");
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("+/-");
          btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                double num = Double.parseDouble(txtAntigo.replace(',', '.'));
                num *=-1;
                txtDisplay.setText(String.format("%f",num));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("0");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("0"));
            }
        });
        pnlCentro.add(btn);

        btn = new JButton(",");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtAntigo = txtDisplay.getText();
                if (!txtAntigo.contains(",")) {
                    txtDisplay.setText(txtAntigo.concat(","));
                }
            }
        });
        pnlCentro.add(btn);

        btn = new JButton("=");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calc.isAguardando()) {
                    String txtAntigo = txtDisplay.getText();
                    calc.setOperando2(Double.parseDouble(txtAntigo.replace(",", ".")));
                    txtDisplay.setText("");
                    calc.getOperando2();
                    txtDisplay.setText("" + calc.calcular());
                }
            }
        });

        pnlCentro.add(btn);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}