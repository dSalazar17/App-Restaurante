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
@Table(name = "mesero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesero.findAll", query = "SELECT m FROM Mesero m")
    , @NamedQuery(name = "Mesero.findByIdmesero", query = "SELECT m FROM Mesero m WHERE m.idmesero = :idmesero")
    , @NamedQuery(name = "Mesero.findByNombremesero", query = "SELECT m FROM Mesero m WHERE m.nombremesero = :nombremesero")
    , @NamedQuery(name = "Mesero.findByApellidomesero", query = "SELECT m FROM Mesero m WHERE m.apellidomesero = :apellidomesero")
    , @NamedQuery(name = "Mesero.findByEdad", query = "SELECT m FROM Mesero m WHERE m.edad = :edad")
    , @NamedQuery(name = "Mesero.findByCalificacion", query = "SELECT m FROM Mesero m WHERE m.calificacion = :calificacion")
    , @NamedQuery(name = "Mesero.findByIdarea", query = "SELECT m FROM Mesero m WHERE m.idarea = :idarea")})
public class Mesero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmesero")
    private Integer idmesero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombremesero")
    private String nombremesero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidomesero")
    private String apellidomesero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "edad")
    private String edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "calificacion")
    private String calificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idarea")
    private int idarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesero")
    private List<Factura> facturaList;

    public Mesero() {
    }

    public Mesero(Integer idmesero) {
        this.idmesero = idmesero;
    }

    public Mesero(Integer idmesero, String nombremesero, String apellidomesero, String edad, String calificacion, int idarea) {
        this.idmesero = idmesero;
        this.nombremesero = nombremesero;
        this.apellidomesero = apellidomesero;
        this.edad = edad;
        this.calificacion = calificacion;
        this.idarea = idarea;
    }

    public Integer getIdmesero() {
        return idmesero;
    }

    public void setIdmesero(Integer idmesero) {
        this.idmesero = idmesero;
    }

    public String getNombremesero() {
        return nombremesero;
    }

    public void setNombremesero(String nombremesero) {
        this.nombremesero = nombremesero;
    }

    public String getApellidomesero() {
        return apellidomesero;
    }

    public void setApellidomesero(String apellidomesero) {
        this.apellidomesero = apellidomesero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesero != null ? idmesero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesero)) {
            return false;
        }
        Mesero other = (Mesero) object;
        if ((this.idmesero == null && other.idmesero != null) || (this.idmesero != null && !this.idmesero.equals(other.idmesero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Mesero[ idmesero=" + idmesero + " ]";
    }
    
}
