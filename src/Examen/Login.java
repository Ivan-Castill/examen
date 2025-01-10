package Examen;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame{
    private JButton accederButton;
    public JPanel panelLogin;
    private JTextField textUsuario;
    private JPasswordField passwordField;

    public Login(JFrame parentFrame)  {
        accederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //optener los datos
                String usuarioIngresado = textUsuario.getText();
                String passwordIngresado = new String(passwordField.getPassword());
                // Validación de las credenciales
                if (validarCredenciales(usuarioIngresado, passwordIngresado)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido \n" + usuarioIngresado + "\n Inicio de sesion exitosa");

                    //abre la siguiente pantalla
                    Gestion_Calificaciones gestionCalificaciones = new Gestion_Calificaciones();
                    gestionCalificaciones.visualizar();
                    parentFrame.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
                    //Metodo para validar las credenciales

            private boolean validarCredenciales (String usuarioIngresado,String passwordIngresado){
                //Datos de Conexion
                String url = "jdbc:mysql://localhost:3306/gestor_calificaciones";
                String user = "root";
                String password = "1234";
                String query = "SELECT NOMBRE_USER,Pass FROM usuarios WHERE NOMBRE_USER = ? AND PASS = ?";
                try (Connection connection = DriverManager.getConnection(url,user,password)){
                    PreparedStatement statement=connection.prepareStatement(query);
                    statement.setString(1, usuarioIngresado);
                    statement.setString(2, passwordIngresado);
                    ResultSet resultSet=statement.executeQuery();

                    return resultSet.next();
                }catch (Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos","ERROR", JOptionPane.ERROR_MESSAGE);
                }
                return false;
            }
        });
    }
}

