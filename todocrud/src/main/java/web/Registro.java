/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import Modelo.UsuarioDAO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Milton Pineda
 */
public class Registro {
    String nombre;
    String correo;
    String contrasenia;
    UsuarioDAO u;
    
    public void validaCorreo(){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@ciencias.unam.mx");

        Matcher mather = pattern.matcher(correo);
 
        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            System.out.println("El dominio del correo es invalido debe ser de dominio @ciencias.unam.mx.");
        }
    }
    }
    
/*    public void registrar() {
        if( checaDominio() == true) {
            enviarCorreo();
            u = new UsuarioDAO();
            u.setUs(nombre, correo, contrasenia);
        }
    }
    
    public void enviarCorreo() {
        
    }
    
    public boolean checaDominio() {
        if ( correo != null){
            return true;
        }
            return false;
    } */

