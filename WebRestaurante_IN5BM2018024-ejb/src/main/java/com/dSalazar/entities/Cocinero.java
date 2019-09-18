/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dSalazar.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dylan Salazar
 */
@Entity
@Table(name = "cocinero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cocinero.findAll", query = "SELECT c FROM Cocinero c")
    , @NamedQuery(name = "Cocinero.findByIdcocinero", query = "SELECT c FROM Cocinero c WHERE c.idcocinero = :idcocinero")
    , @NamedQuery(name = "Cocinero.findByNomcroco", query = "SELECT c FROM Cocinero c WHERE c.nomcroco = :nomcroco")
    , @NamedQuery(name = "Cocinero.findByApellidoco", query = "SELECT c FROM Cocinero c WHERE c.apellidoco = :apellidoco")
    , @NamedQuery(name = "Cocinero.findByEspecialidad", query = "SELECT c FROM Cocinero c WHERE c.especialidad = :especialidad")})
public class Cocinero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcocinero")
    private Integer idcocinero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nomcroco")
    private String nomcroco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidoco")
    private String apellidoco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "especialidad")
    private String especialidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcocinero")
    private List<Detallefactura> detallefacturaList;

    public Cocinero() {
    }

    public Cocinero(Integer idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Cocinero(Integer idcocinero, String nomcroco, String apellidoco, String especialidad) {
        this.idcocinero = idcocinero;
        this.nomcroco = nomcroco;
        this.apellidoco = apellidoco;
        this.especialidad = especialidad;
    }

    public Integer getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Integer idcocinero) {
        this.idcocinero = idcocinero;
    }

    public String getNomcroco() {
        return nomcroco;
    }

    public void setNomcroco(String nomcroco) {
        this.nomcroco = nomcroco;
    }

    public String getApellidoco() {
        return apellidoco;
    }

    public void setApellidoco(String apellidoco) {
        this.apellidoco = apellidoco;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcocinero != null ? idcocinero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocinero)) {
            return false;
        }
        Cocinero other = (Cocinero) object;
        if ((this.idcocinero == null && other.idcocinero != null) || (this.idcocinero != null && !this.idcocinero.equals(other.idcocinero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Cocinero[ idcocinero=" + idcocinero + " ]";
    }
    
}
