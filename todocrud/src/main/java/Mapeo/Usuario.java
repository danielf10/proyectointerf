/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

/**
 *
 * @author Milton
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario  {
    @Id
    @Column(name="idusuario")
    private String idusuario;
   
    @Column(name="correo")
    private String correo;
    
    
    @Column(name="contrasenia")
    private String contrasenia;
    
    public Usuario(){
    }
    
    
    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String nombre) {
        this.idusuario = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
