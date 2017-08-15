
package ar.gob.ambiente.sacvefor.servicios.trazabilidad;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Usuarios provenientes del servicio de Trazabilidad
 * @author rincostante
 */
@XmlRootElement
public class Usuario implements Serializable {
    
    private Long id;
    private Parametrica rol;
    private String jurisdiccion;
    private Long idProvGt;
    private Long login;
    private String nombreCompleto;
    private String email;  
    
    /******************
     * Constructores **
     ******************/
    public Usuario(){
        this.id = Long.valueOf(0);
        this.rol = new Parametrica();
        this.jurisdiccion = "default";
        this.idProvGt = Long.valueOf(0);
        this.login = Long.valueOf(0);
        this.nombreCompleto = "default";
        this.email = "default";
    }
    
    public Usuario(Long id, Parametrica rol, String jurisdiccion, Long idProvGt, Long login, String nombreCompleto, String email){
        this.id = id;
        this.rol = rol;
        this.jurisdiccion = jurisdiccion;
        this.idProvGt = idProvGt;
        this.login = login;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }    

    /**********************
     * Métodos de acceso **
     **********************/       
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Parametrica getRol() {
        return rol;
    }

    public void setRol(Parametrica rol) {
        this.rol = rol;
    }

    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }

    public Long getIdProvGt() {
        return idProvGt;
    }

    public void setIdProvGt(Long idProvGt) {
        this.idProvGt = idProvGt;
    }

    public Long getLogin() {
        return login;
    }

    public void setLogin(Long login) {
        this.login = login;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    /*************************
     * Métodos sobreecritos **
     *************************/  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" rol: ").append(rol.getNombre()).
                append(" jurisdiccion: ").append(jurisdiccion).
                append(" idProvGt: ").append(idProvGt).
                append(" login: ").append(login).
                append(" nombreCompleto: ").append(nombreCompleto).
                append(" email: ").append(email).toString();
    }    
}
