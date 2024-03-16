import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
  Manipulador manipulador = new Manipulador();

  JTextField jtPainel = new JTextField();

  JButton jb7 = new JButton("7");
  JButton jb8 = new JButton("8");
  JButton jb9 = new JButton("9");
  JButton jbDiv = new JButton("/");

  JButton jb4 = new JButton("4");
  JButton jb5 = new JButton("5");
  JButton jb6 = new JButton("6");
  JButton jbMul = new JButton("*");

  JButton jb1 = new JButton("1");
  JButton jb2 = new JButton("2");
  JButton jb3 = new JButton("3");
  JButton jbSub = new JButton("-");

  JButton jb0 = new JButton("0");
  JButton jbClear = new JButton("<x");
  JButton jbEquals = new JButton("=");
  JButton jbSum = new JButton("+");

  public Calculadora() {
    super("Calculadora");
    setSize(385, 350);
    setLocationRelativeTo(null);
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jtPainel.setBounds(10, 10, 350, 50);
    add(jtPainel);
    jtPainel.setEnabled(false);
    jtPainel.setDisabledTextColor(Color.BLACK);

    jb7.setBounds(10, 70, 80, 50);
    add(jb7);
    jb8.setBounds(100, 70, 80, 50);
    add(jb8);
    jb9.setBounds(190, 70, 80, 50);
    add(jb9);
    jbDiv.setBounds(280, 70, 80, 50);
    add(jbDiv);

    jb4.setBounds(10, 130, 80, 50);
    add(jb4);
    jb5.setBounds(100, 130, 80, 50);
    add(jb5);
    jb6.setBounds(190, 130, 80, 50);
    add(jb6);
    jbMul.setBounds(280, 130, 80, 50);
    add(jbMul);

    jb1.setBounds(10, 190, 80, 50);
    add(jb1);
    jb2.setBounds(100, 190, 80, 50);
    add(jb2);
    jb3.setBounds(190, 190, 80, 50);
    add(jb3);
    jbSub.setBounds(280, 190, 80, 50);
    add(jbSub);

    jb0.setBounds(10, 250, 80, 50);
    add(jb0);
    jbClear.setBounds(100, 250, 80, 50);
    add(jbClear);
    jbEquals.setBounds(190, 250, 80, 50);
    add(jbEquals);
    jbSum.setBounds(280, 250, 80, 50);
    add(jbSum);

    jb7.addActionListener(manipulador);
    jb8.addActionListener(manipulador);
    jb9.addActionListener(manipulador);
    jbDiv.addActionListener(manipulador);

    jb4.addActionListener(manipulador);
    jb5.addActionListener(manipulador);
    jb6.addActionListener(manipulador);
    jbMul.addActionListener(manipulador);

    jb1.addActionListener(manipulador);
    jb2.addActionListener(manipulador);
    jb3.addActionListener(manipulador);
    jbSub.addActionListener(manipulador);

    jb0.addActionListener(manipulador);
    jbClear.addActionListener(manipulador);
    jbEquals.addActionListener(manipulador);
    jbSum.addActionListener(manipulador);

    setVisible(true);
  }

  public class Manipulador implements ActionListener {
    String func = "";
    int a = 0, b = 0;

    @Override
    public void actionPerformed(ActionEvent event) {
      if (event.getSource() == jb7) {
        jtPainel.setText(jtPainel.getText() + "7");
      } else if (event.getSource() == jb8) {
        jtPainel.setText(jtPainel.getText() + "8");
      } else if (event.getSource() == jb9) {
        jtPainel.setText(jtPainel.getText() + "9");
      } else if (event.getSource() == jb4) {
        jtPainel.setText(jtPainel.getText() + "4");
      } else if (event.getSource() == jb5) {
        jtPainel.setText(jtPainel.getText() + "5");
      } else if (event.getSource() == jb6) {
        jtPainel.setText(jtPainel.getText() + "6");
      } else if (event.getSource() == jb1) {
        jtPainel.setText(jtPainel.getText() + "1");
      } else if (event.getSource() == jb2) {
        jtPainel.setText(jtPainel.getText() + "2");
      } else if (event.getSource() == jb3) {
        jtPainel.setText(jtPainel.getText() + "3");
      } else if (event.getSource() == jb0) {
        jtPainel.setText(jtPainel.getText() + "0");
      } else if (event.getSource() == jbClear) {
        if (!(jtPainel.getText().equals(""))) {
          String velha = jtPainel.getText();
          String nova = velha.substring(0, velha.length() - 1);
          jtPainel.setText(nova);
        }
      } else if (event.getSource() == jbEquals) {
        if (func.equals("/")) {
          try {
            b = Integer.parseInt(jtPainel.getText());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor valido primeiro.");
            jtPainel.requestFocus();
            jtPainel.setText("");
          }
          try {
            jtPainel.setText(Logica.div(a, b));
            jtPainel.requestFocus();
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, e.getMessage());
            jtPainel.requestFocus();
          }
        } else if (func.equals("*")) {
          try {
            b = Integer.parseInt(jtPainel.getText());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor valido primeiro.");
            jtPainel.requestFocus();
            jtPainel.setText("");
          }
          try {
            jtPainel.setText(Logica.mul(a, b));
            jtPainel.requestFocus();
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, e.getMessage());
            jtPainel.requestFocus();
          }
        } else if (func.equals("-")) {
          try {
            b = Integer.parseInt(jtPainel.getText());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor valido primeiro.");
            jtPainel.requestFocus();
            jtPainel.setText("");
          }
          try {
            jtPainel.setText(Logica.sub(a, b));
            jtPainel.requestFocus();
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, e.getMessage());
            jtPainel.requestFocus();
          }
        } else if (func.equals("+")) {
          try {
            b = Integer.parseInt(jtPainel.getText());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor valido primeiro.");
            jtPainel.requestFocus();
            jtPainel.setText("");
          }
          try {
            jtPainel.setText(Logica.somar(a, b));
            jtPainel.requestFocus();
          } catch (Exception e) {
            JOptionPane.showMessageDialog(Calculadora.this, e.getMessage());
            jtPainel.requestFocus();
          }
        }
      } else if (event.getSource() == jbDiv) {
        try {
          a = Integer.parseInt(jtPainel.getText());
          jtPainel.setText("");
          func = "/";
        } catch (Exception e) {
          JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor válido primeiro.");
          jtPainel.requestFocus();
          jtPainel.setText("");
        }
      } else if (event.getSource() == jbMul) {
        try {
          a = Integer.parseInt(jtPainel.getText());
          jtPainel.setText("");
          func = "*";
        } catch (Exception e) {
          JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor válido primeiro.");
          jtPainel.requestFocus();
          jtPainel.setText("");
        }
      } else if (event.getSource() == jbSub) {
        try {
          a = Integer.parseInt(jtPainel.getText());
          jtPainel.setText("");
          func = "-";
        } catch (Exception e) {
          JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor válido primeiro.");
          jtPainel.requestFocus();
          jtPainel.setText("");
        }
      } else if (event.getSource() == jbSum) {
        try {
          a = Integer.parseInt(jtPainel.getText());
          jtPainel.setText("");
          func = "+";
        } catch (Exception e) {
          JOptionPane.showMessageDialog(Calculadora.this, "Digite um valor válido primeiro.");
          jtPainel.requestFocus();
          jtPainel.setText("");
        }
      }
    }
  }
}
