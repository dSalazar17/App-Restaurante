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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a")
    , @NamedQuery(name = "Area.findByIdarea", query = "SELECT a FROM Area a WHERE a.idarea = :idarea")
    , @NamedQuery(name = "Area.findByNombrearea", query = "SELECT a FROM Area a WHERE a.nombrearea = :nombrearea")})
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idarea")
    private Integer idarea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrearea")
    private String nombrearea;
    @JoinColumn(name = "idmesa", referencedColumnName = "idmesa")
    @ManyToOne(optional = false)
    private Mesa idmesa;
    @JoinColumn(name = "detallefactura_iddetallefactura", referencedColumnName = "iddetallefactura")
    @ManyToOne(optional = false)
    private Detallefactura detallefacturaIddetallefactura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idarea")
    private List<Detallefactura> detallefacturaList;

    public Area() {
    }

    public Area(Integer idarea) {
        this.idarea = idarea;
    }

    public Area(Integer idarea, String nombrearea) {
        this.idarea = idarea;
        this.nombrearea = nombrearea;
    }

    public Integer getIdarea() {
        return idarea;
    }

    public void setIdarea(Integer idarea) {
        this.idarea = idarea;
    }

    public String getNombrearea() {
        return nombrearea;
    }

    public void setNombrearea(String nombrearea) {
        this.nombrearea = nombrearea;
    }

    public Mesa getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Mesa idmesa) {
        this.idmesa = idmesa;
    }

    public Detallefactura getDetallefacturaIddetallefactura() {
        return detallefacturaIddetallefactura;
    }

    public void setDetallefacturaIddetallefactura(Detallefactura detallefacturaIddetallefactura) {
        this.detallefacturaIddetallefactura = detallefacturaIddetallefactura;
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
        hash += (idarea != null ? idarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.idarea == null && other.idarea != null) || (this.idarea != null && !this.idarea.equals(other.idarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Area[ idarea=" + idarea + " ]";
    }
    
}
