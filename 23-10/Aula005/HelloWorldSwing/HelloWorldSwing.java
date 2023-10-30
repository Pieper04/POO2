import javax.swing.*;

public class HelloWorldSwing {

    private static void createAndShowGUI() {
        // Cria e configura a janela.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adicione o label "Hello World".
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Mostra a janela.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
