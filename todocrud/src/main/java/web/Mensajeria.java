/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ALIENWARE
 */
public class Mensajeria {

    private String correo = "miltonpineda";
    private String correoEnvia = "miltonpineda@ciencias.unam.mx";
    private String claveEnvia = "tusabrás";
    private String enlace = "http://localhost:8080/registro.jsp";
    String nombreUsuario, contraseña;

    public boolean enviaCorreo() {
        String correociencias = correo + "@ciencias.unam.mx";
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        Session session = Session.getInstance(p, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(correoEnvia, claveEnvia);
            }
        });
        //session.setDebug(true); // Para ver el proceso de envío.
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoEnvia));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(correociencias));
            message.setSubject("Registro Ciencias");
            String texto = "Estimado usuario:\n\nDe click en el siguiente enlace para confirmar su registro en YumYum Ciencias:"
                    + "\n\n%s\n"
                    + "\n\nDatos Registrados:\n"
                    + "\nNombre de usuario: %s"
                    + "\nContraseña: %s"
                    + "\n\nSaludos,"
                    + "\n\n Ciencias.";
            String mensaje = String.format(texto, cifraClave(), nombreUsuario, contraseña);
            message.setText(mensaje); // Se usa si se va a mandar texto plano.
            Transport.send(message);
            System.out.println("Correo enviado a " + correociencias + "con Éxito!!!\n" + mensaje);
            return true;
        } catch (MessagingException e) {
            System.err.println("\n" + e.getMessage());
        }
        return false;
    }

    public String cifraClave() {
        // Código para generar el parámetro del enlace (NombreDeUsuario en hexadecimal
        String clave = "?param=2A1B4E";
        return enlace + clave;
    }
}
