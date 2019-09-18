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
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByIdclientes", query = "SELECT c FROM Clientes c WHERE c.idclientes = :idclientes")
    , @NamedQuery(name = "Clientes.findByNombrec", query = "SELECT c FROM Clientes c WHERE c.nombrec = :nombrec")
    , @NamedQuery(name = "Clientes.findByApellidosc", query = "SELECT c FROM Clientes c WHERE c.apellidosc = :apellidosc")
    , @NamedQuery(name = "Clientes.findByDireccion", query = "SELECT c FROM Clientes c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Clientes.findByTipocliente", query = "SELECT c FROM Clientes c WHERE c.tipocliente = :tipocliente")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclientes")
    private Integer idclientes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrec")
    private String nombrec;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidosc")
    private String apellidosc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipocliente")
    private String tipocliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcliente")
    private List<Factura> facturaList;

    public Clientes() {
    }

    public Clientes(Integer idclientes) {
        this.idclientes = idclientes;
    }

    public Clientes(Integer idclientes, String nombrec, String apellidosc, String direccion, String tipocliente) {
        this.idclientes = idclientes;
        this.nombrec = nombrec;
        this.apellidosc = apellidosc;
        this.direccion = direccion;
        this.tipocliente = tipocliente;
    }

    public Integer getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Integer idclientes) {
        this.idclientes = idclientes;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getApellidosc() {
        return apellidosc;
    }

    public void setApellidosc(String apellidosc) {
        this.apellidosc = apellidosc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
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
        hash += (idclientes != null ? idclientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idclientes == null && other.idclientes != null) || (this.idclientes != null && !this.idclientes.equals(other.idclientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dSalazar.entities.Clientes[ idclientes=" + idclientes + " ]";
    }
    
}
