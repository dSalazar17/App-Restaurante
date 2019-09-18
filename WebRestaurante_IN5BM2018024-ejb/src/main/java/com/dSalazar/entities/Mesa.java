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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dylan Salazar
 */
@Entity
@Table(name = "mesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesa.findAll", query = "SELECT m FROM Mesa m")
    , @NamedQuery(name = "Mesa.findByIdmesa", query = "SELECT m FROM Mesa m WHERE m.idmesa = :idmesa")
    , @NamedQuery(name = "Mesa.findByTotalpersonas", query = "SELECT m FROM Mesa m WHERE m.totalpersonas = :totalpersonas")})
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmesa")
    private Integer idmesa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalpersonas")
    private int totalpersonas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesa")
    private List<Area> areaList;

    public Mesa() {
    }

    public Mesa(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public Mesa(Integer idmesa, int totalpersonas) {
        this.idmesa = idmesa;
        this.totalpersonas = totalpersonas;
    }

    public Integer getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public int getTotalpersonas() {
        return totalpersonas;
    }

    public void setTotalpersonas(int totalpersonas) {
        this.totalpersonas = totalpersonas;
    }

    @XmlTransient
    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesa != null ? idmesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if ((this.idmesa == null && other.idmesa != null) || (this.idmesa != null && !this.idmesa.equals(other.idmesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Mesa[ idmesa=" + idmesa + " ]";
    }
    
}
