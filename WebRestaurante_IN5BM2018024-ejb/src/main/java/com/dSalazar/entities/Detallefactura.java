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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dylan Salazar
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByIddetallefactura", query = "SELECT d FROM Detallefactura d WHERE d.iddetallefactura = :iddetallefactura")
    , @NamedQuery(name = "Detallefactura.findByPrecioventa", query = "SELECT d FROM Detallefactura d WHERE d.precioventa = :precioventa")
    , @NamedQuery(name = "Detallefactura.findByCantidad", query = "SELECT d FROM Detallefactura d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefactura.findByTotalpagar", query = "SELECT d FROM Detallefactura d WHERE d.totalpagar = :totalpagar")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddetallefactura")
    private Integer iddetallefactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioventa")
    private double precioventa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalpagar")
    private double totalpagar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detallefacturaIddetallefactura")
    private List<Area> areaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddetalleorden")
    private List<Factura> facturaList;
    @JoinColumn(name = "idarea", referencedColumnName = "idarea")
    @ManyToOne(optional = false)
    private Area idarea;
    @JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
    @ManyToOne(optional = false)
    private Cocinero idcocinero;
    @JoinColumn(name = "idplatos", referencedColumnName = "idplatos")
    @ManyToOne(optional = false)
    private Platos idplatos;

    public Detallefactura() {
    }

    public Detallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public Detallefactura(Integer iddetallefactura, double precioventa, double cantidad, double totalpagar) {
        this.iddetallefactura = iddetallefactura;
        this.precioventa = precioventa;
        this.cantidad = cantidad;
        this.totalpagar = totalpagar;
    }

    public Integer getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(double totalpagar) {
        this.totalpagar = totalpagar;
    }

    @XmlTransient
    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    public Area getIdarea() {
        return idarea;
    }

    public void setIdarea(Area idarea) {
        this.idarea = idarea;
    }

    public Cocinero getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Cocinero idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Platos getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(Platos idplatos) {
        this.idplatos = idplatos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallefactura != null ? iddetallefactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.iddetallefactura == null && other.iddetallefactura != null) || (this.iddetallefactura != null && !this.iddetallefactura.equals(other.iddetallefactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Detallefactura[ iddetallefactura=" + iddetallefactura + " ]";
    }
    
}
