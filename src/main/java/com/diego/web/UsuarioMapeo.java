package com.diego.web;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")

public class UsuarioMapeo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Id
    @Column(name="login")        
    private String login;
    @Column(name="password")
    private String password;
    @Column(name="admin_rol")
    private Character admin_rol;

    public UsuarioMapeo() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getAdmin_rol() {
        return admin_rol;
    }

    public void setAdmin_rol(Character admin_rol) {
        this.admin_rol = admin_rol;
    }

    /**ESTE CONSTRUCTOR INICIALIZA UN OBJETO DE TIPO USUARIO A GENERARSE COMO MAPEP A LA TABLA USUARIO
     * 
     * @param login MAPEO DE LA COLUMNA USUARIO
     * @param password MAPEO DE LA COLUMNA PASSWORD
     * @param admin_rol MAPEO AL ROL ADMINISTRATIVO
     */
    public UsuarioMapeo(String login, String password, Character admin_rol) {
        this.login = login;
        this.password = password;
        this.admin_rol = admin_rol;
    }

    @Override
    public String toString() {
        return "UsuarioMapeo{" + "login=" + login + ", password=" + password + ", admin_rol=" + admin_rol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.login != null ? this.login.hashCode() : 0);
        hash = 83 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 83 * hash + (this.admin_rol != null ? this.admin_rol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioMapeo other = (UsuarioMapeo) obj;
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if (this.admin_rol != other.admin_rol && (this.admin_rol == null || !this.admin_rol.equals(other.admin_rol))) {
            return false;
        }
        return true;
    }

    public UsuarioMapeo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioMapeo)) {
            return false;
        }
        UsuarioMapeo other = (UsuarioMapeo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diego.web.UsuarioMapeo[ id=" + id + " ]";
    }
    
    
    
}
