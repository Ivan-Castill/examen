package Examen;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutando Programa (°w°)");
        JFrame frame = new JFrame("LOGIN");
        frame.setContentPane(new Login(frame).panelLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setPreferredSize(new Dimension(500,300));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}