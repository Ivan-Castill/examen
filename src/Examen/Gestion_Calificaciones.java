package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gestion_Calificaciones extends JFrame {
    private JTextField textid;
    private JPanel panelgestor;
    private JTextField textnombre;
    private JTextField textcedula;
    private JTextField notaMatematica;
    private JTextField notaLenguaje;
    private JTextField notaProgramacion;
    private JTextField notaPoo;
    private JTextField notaDiseño;
    private JButton registrarDatosButton;

    public Gestion_Calificaciones() {
        setContentPane(panelgestor);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setPreferredSize(new Dimension(1000,500));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        registrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idEstudiante = textid.getText();
                String nombreEstudiante = textnombre.getText();
                String cedulaEstudiante = textcedula.getText();
                String matematicasNota = notaMatematica.getText();
                String lenguajeNota = notaLenguaje.getText();
                String programacionNota = notaProgramacion.getText();
                String pooNota = notaPoo.getText();
                String disenioNota = notaDiseño.getText();



            }
        });
    }

    public void visualizar() {
        setVisible(true);
    }
}
