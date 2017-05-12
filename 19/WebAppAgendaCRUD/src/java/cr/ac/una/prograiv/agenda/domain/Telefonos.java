package cr.ac.una.prograiv.agenda.domain;
// Generated Apr 15, 2016 9:11:43 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Telefonos generated by hbm2java
 */
public class Telefonos  implements java.io.Serializable {


     private int pkTelefono;
     private int pkFkCedula;
     private String descripcion;
     private String ultUsuario;
     private Date ultModificacion;

    public Telefonos() {
    }

	
    public Telefonos(int pkTelefono, int pkFkCedula) {
        this.pkTelefono = pkTelefono;
        this.pkFkCedula = pkFkCedula;
    }
    public Telefonos(int pkTelefono, int pkFkCedula, String descripcion, String ultUsuario, Date ultModificacion) {
       this.pkTelefono = pkTelefono;
       this.pkFkCedula = pkFkCedula;
       this.descripcion = descripcion;
       this.ultUsuario = ultUsuario;
       this.ultModificacion = ultModificacion;
    }
   
    public int getPkTelefono() {
        return this.pkTelefono;
    }
    
    public void setPkTelefono(int pkTelefono) {
        this.pkTelefono = pkTelefono;
    }
    public int getPkFkCedula() {
        return this.pkFkCedula;
    }
    
    public void setPkFkCedula(int pkFkCedula) {
        this.pkFkCedula = pkFkCedula;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUltUsuario() {
        return this.ultUsuario;
    }
    
    public void setUltUsuario(String ultUsuario) {
        this.ultUsuario = ultUsuario;
    }
    public Date getUltModificacion() {
        return this.ultModificacion;
    }
    
    public void setUltModificacion(Date ultModificacion) {
        this.ultModificacion = ultModificacion;
    }




}


