package com.dSalazar.entities;

import com.dSalazar.entities.Clientes;
import com.dSalazar.entities.Detallefactura;
import com.dSalazar.entities.Mesero;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:16:04")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Integer> idmesa;
    public static volatile SingularAttribute<Factura, Detallefactura> iddetalleorden;
    public static volatile SingularAttribute<Factura, Clientes> idcliente;
    public static volatile SingularAttribute<Factura, Mesero> idmesero;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}