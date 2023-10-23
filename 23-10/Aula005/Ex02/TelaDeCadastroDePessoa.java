import java.awt.*;
import javax.swing.*;

public class TelaDeCadastroDePessoa extends JFrame {
    JLabel lblNome = new JLabel("Nome: ");
    JLabel lblEndereco = new JLabel("Endereço: ");
    JLabel lblTelefone = new JLabel("Telefone: ");
    JLabel lblCpf = new JLabel("Cpf: ");
    JLabel lblSexos = new JLabel("Sexo: ");
    JTextField txtNome = new JTextField(null, 20);
    JTextField txtEndereco = new JTextField(null, 20);
    JTextField txtTelefone = new JTextField(null, 20);
    JTextField txtCpf = new JTextField(null, 20);
    String[] sexos = { "Masculino", "Feminino" };
    JComboBox cboSexo = new JComboBox(sexos);
    JButton btnGravar = new JButton("Gravar");
    JButton btnFechar = new JButton("Fechar");

    public TelaDeCadastroDePessoa() {
        Container c = getContentPane();
        setLayout(new GridLayout(0, 2));
        setTitle("Cadastro de Pessoa");
        c.add(lblNome);
        c.add(txtNome);
        c.add(lblEndereco);
        c.add(txtEndereco);
        c.add(lblTelefone);
        c.add(txtTelefone);
        c.add(lblCpf);
        c.add(txtCpf);
        c.add(lblSexos);
        c.add(cboSexo);
        c.add(btnGravar);
        c.add(btnFechar);
        setVisible(true);
        pack();
    }
}