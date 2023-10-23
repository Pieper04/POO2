import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.text.Normalizer.Form;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Aula005 {

    public static void main(String[] args) {
        // componente JFrame
        JFrame miJFrame = new JFrame("Exemplo tela 1 - Java Swing");
        miJFrame.setSize(500, 300);

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // usamos este layout para centralizar os componentes JPanel
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Me de sua opnião sincera sobre java:   ");

        // componente JTextArea
        JTextArea miJTextArea = new JTextArea(5, 20);

        /*// componente Botao
        JButton bta = new JButton("OK");
        bta.setBounds(800, 800, 200, 100);
        bta.setText("Clica ni mim");*/

        // conecte os componentes JLabel e JTextField no JPanel
        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);
        //miJPanel.add(bta);

        // conectar Jpanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);

    }
}
