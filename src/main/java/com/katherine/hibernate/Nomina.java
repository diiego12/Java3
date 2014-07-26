/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.katherine.hibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author T107
 */
@Entity
@Table(name = "nomina")
@NamedQueries({
    @NamedQuery(name = "Nomina.findAll", query = "SELECT n FROM Nomina n"),
    @NamedQuery(name = "Nomina.findByIdNomina", query = "SELECT n FROM Nomina n WHERE n.idNomina = :idNomina"),
    @NamedQuery(name = "Nomina.findByIdUsuario", query = "SELECT n FROM Nomina n WHERE n.idUsuario = :idUsuario"),
    @NamedQuery(name = "Nomina.findBySaldo", query = "SELECT n FROM Nomina n WHERE n.saldo = :saldo")})
public class Nomina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nomina")
    private Integer idNomina;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private Float saldo;

    public Nomina() {
    }

    public Nomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNomina != null ? idNomina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nomina)) {
            return false;
        }
        Nomina other = (Nomina) object;
        if ((this.idNomina == null && other.idNomina != null) || (this.idNomina != null && !this.idNomina.equals(other.idNomina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.katherine.hibernate.Nomina[ idNomina=" + idNomina + " ]";
    }
    
}
