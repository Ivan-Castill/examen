package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gestión_Calificaciones extends JFrame {
    private JTextField textField1;
    private JPanel panel1;
    private JTextField textField2;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton registrarDatosButton;

    public Gestión_Calificaciones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setPreferredSize(new Dimension(500,300));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        registrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void visualizar() {
        setVisible(true);
    }
}
