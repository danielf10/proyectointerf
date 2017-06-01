    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

/**
 *
 * @author Milton Pineda
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
    @Table(name="puesto")
    public class Puesto {
    
    @Id
    @Column(name="idpuesto")
    private String idpuesto;
    
     @Column(name="cordenada_x")
    private String cordenada_x;
     
     @Column(name="cordenada_y")
    private String cordenada_y;
     
     @Column(name="descripcion")
    private String descripcion;
     
     @Column(name="horario")
    private String horario;

    public String getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(String idpuesto) {
        this.idpuesto = idpuesto;
    }

    public String getCordenada_x() {
        return cordenada_x;
    }

    public void setCordenada_x(String cordenada_x) {
        this.cordenada_x = cordenada_x;
    }

    public String getCordenada_y() {
        return cordenada_y;
    }

    public void setCordenada_y(String cordenada_y) {
        this.cordenada_y = cordenada_y;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
