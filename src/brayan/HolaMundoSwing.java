package brayan;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HolaMundoSwing {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout()); // Usamos BorderLayout para el marco principal

        // Crear un JPanel con FlowLayout para manejar márgenes
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20)); // Márgenes de 20 píxeles

        // Crear el botón
        JButton button = new JButton("Haz click aquí");
        // Establecer márgenes alrededor del botón

        // Establecer el tamaño preferido del botón para que no ocupe todo el espacio
        button.setPreferredSize(new java.awt.Dimension(150, 50)); // Establecemos un tamaño fijo para el botón
   
        // Acción del botón
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Hola mundo!!");
        });

        // Añadir el botón al panel
        panel.add(button);

        // Añadir el panel al centro del JFrame
        ventana.add(panel, BorderLayout.CENTER);

        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
