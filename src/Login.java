import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Validación de Usuario");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Usuario:");
        label1.setBounds(20, 20, 100, 20);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(120, 20, 150, 20);
        frame.add(textField1);

        JLabel label2 = new JLabel("Contraseña:");
        label2.setBounds(20, 50, 100, 20);
        frame.add(label2);

        JPasswordField passwordField1 = new JPasswordField();
        passwordField1.setBounds(120, 50, 150, 20);
        frame.add(passwordField1);

        JLabel label3 = new JLabel("Nota:usuario-contraseña'APELLIDO' y 'APELLIDO123' respectivamente.");
        label3.setBounds(20, 80, 250, 20);
        frame.add(label3);

        JButton button1 = new JButton("Validar");
        button1.setBounds(100, 110, 100, 20);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textField1.getText();
                String contrasena = new String(passwordField1.getPassword());

                if (usuario.equals("APELLIDO") && contrasena.equals("APELLIDO123")) {
                    JOptionPane.showMessageDialog(null, "Acceso correcto");
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado");
                }
            }
        });
        frame.add(button1);

        frame.setVisible(true);
    }
}