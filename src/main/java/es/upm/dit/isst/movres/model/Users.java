package es.upm.dit.isst.movres.model;

import javax.persistence.*;

@Entity
public class Users {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String email;
    private String contraseña;
    private String usuario;
    private String nombre;
    private String apellidos;
    private Boolean isAdmin;

    protected Users (){}

    public Users(String email, String contraseña, String usuario, String nombre, String apellidos,
            Boolean isAdmin) {
        this.email = email;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.isAdmin = isAdmin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Users [id=" + id + ", email=" + email +  ", contraseña=" + contraseña + ", usuario=" + usuario + ", nombre=" + nombre + ",apellidos=" + apellidos +
                ", isAdmin=" + isAdmin +  "]";
    }

    

    
}