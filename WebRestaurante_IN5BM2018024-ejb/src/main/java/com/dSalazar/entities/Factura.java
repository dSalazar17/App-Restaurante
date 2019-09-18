/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dSalazar.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dylan Salazar
 */
@Entity
@Table(name = "factura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByIdfactura", query = "SELECT f FROM Factura f WHERE f.idfactura = :idfactura")
    , @NamedQuery(name = "Factura.findByIdmesa", query = "SELECT f FROM Factura f WHERE f.idmesa = :idmesa")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfactura")
    private Integer idfactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmesa")
    private int idmesa;
    @JoinColumn(name = "idcliente", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes idcliente;
    @JoinColumn(name = "iddetalleorden", referencedColumnName = "iddetallefactura")
    @ManyToOne(optional = false)
    private Detallefactura iddetalleorden;
    @JoinColumn(name = "idmesero", referencedColumnName = "idmesero")
    @ManyToOne(optional = false)
    private Mesero idmesero;

    public Factura() {
    }

    public Factura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public Factura(Integer idfactura, int idmesa) {
        this.idfactura = idfactura;
        this.idmesa = idmesa;
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public int getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(int idmesa) {
        this.idmesa = idmesa;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    public Detallefactura getIddetalleorden() {
        return iddetalleorden;
    }

    public void setIddetalleorden(Detallefactura iddetalleorden) {
        this.iddetalleorden = iddetalleorden;
    }

    public Mesero getIdmesero() {
        return idmesero;
    }

    public void setIdmesero(Mesero idmesero) {
        this.idmesero = idmesero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactura != null ? idfactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.idfactura == null && other.idfactura != null) || (this.idfactura != null && !this.idfactura.equals(other.idfactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Factura[ idfactura=" + idfactura + " ]";
    }
    
}
