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
@Table(name = "platos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platos.findAll", query = "SELECT p FROM Platos p")
    , @NamedQuery(name = "Platos.findByIdplatos", query = "SELECT p FROM Platos p WHERE p.idplatos = :idplatos")
    , @NamedQuery(name = "Platos.findByNombreplato", query = "SELECT p FROM Platos p WHERE p.nombreplato = :nombreplato")
    , @NamedQuery(name = "Platos.findByTipoplato", query = "SELECT p FROM Platos p WHERE p.tipoplato = :tipoplato")
    , @NamedQuery(name = "Platos.findByPrecioplato", query = "SELECT p FROM Platos p WHERE p.precioplato = :precioplato")})
public class Platos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idplatos")
    private Integer idplatos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreplato")
    private String nombreplato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoplato")
    private String tipoplato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioplato")
    private double precioplato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idplatos")
    private List<Detallefactura> detallefacturaList;

    public Platos() {
    }

    public Platos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public Platos(Integer idplatos, String nombreplato, String tipoplato, double precioplato) {
        this.idplatos = idplatos;
        this.nombreplato = nombreplato;
        this.tipoplato = tipoplato;
        this.precioplato = precioplato;
    }

    public Integer getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public String getNombreplato() {
        return nombreplato;
    }

    public void setNombreplato(String nombreplato) {
        this.nombreplato = nombreplato;
    }

    public String getTipoplato() {
        return tipoplato;
    }

    public void setTipoplato(String tipoplato) {
        this.tipoplato = tipoplato;
    }

    public double getPrecioplato() {
        return precioplato;
    }

    public void setPrecioplato(double precioplato) {
        this.precioplato = precioplato;
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
        hash += (idplatos != null ? idplatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platos)) {
            return false;
        }
        Platos other = (Platos) object;
        if ((this.idplatos == null && other.idplatos != null) || (this.idplatos != null && !this.idplatos.equals(other.idplatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Platos[ idplatos=" + idplatos + " ]";
    }
    
}
