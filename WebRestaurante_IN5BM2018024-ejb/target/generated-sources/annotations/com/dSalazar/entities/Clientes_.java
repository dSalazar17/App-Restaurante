package com.dSalazar.entities;

import com.dSalazar.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:16:04")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidosc;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, String> tipocliente;
    public static volatile ListAttribute<Clientes, Factura> facturaList;
    public static volatile SingularAttribute<Clientes, Integer> idclientes;
    public static volatile SingularAttribute<Clientes, String> nombrec;

}