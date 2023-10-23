import java.awt.*;
import javax.swing.*;

public class PrimeiraTelaSwing extends JFrame {
    JLabel lblNome = new JLabel("Nome");
    JLabel lblEndereco = new JLabel("Endereço");
    JLabel lblSexo = new JLabel("Sexo");
    JTextField txtNome = new JTextField(null, 20);
    JTextField txtEndereco = new JTextField(null, 30);
    JButton btnGravar = new JButton("Gravar");
    JButton btnFechar = new JButton("Fechar");
    String[] sexos = { "Masculino", "Feminino" };
    JComboBox cboSexo = new JComboBox(sexos);

    public PrimeiraTelaSwing() {
        setSize(150, 300);
        setLayout(new FlowLayout());
        getContentPane().add(lblNome);
        getContentPane().add(txtNome);
        getContentPane().add(lblEndereco);
        getContentPane().add(txtEndereco);
        getContentPane().add(lblSexo);
        getContentPane().add(cboSexo);
        getContentPane().add(btnGravar);
        getContentPane().add(btnFechar);
        setVisible(true);
        pack();
    }
}