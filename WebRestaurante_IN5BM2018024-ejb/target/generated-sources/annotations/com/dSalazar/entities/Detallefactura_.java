package com.dSalazar.entities;

import com.dSalazar.entities.Area;
import com.dSalazar.entities.Cocinero;
import com.dSalazar.entities.Factura;
import com.dSalazar.entities.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:16:04")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Area> idarea;
    public static volatile ListAttribute<Detallefactura, Area> areaList;
    public static volatile SingularAttribute<Detallefactura, Platos> idplatos;
    public static volatile SingularAttribute<Detallefactura, Double> totalpagar;
    public static volatile ListAttribute<Detallefactura, Factura> facturaList;
    public static volatile SingularAttribute<Detallefactura, Double> precioventa;
    public static volatile SingularAttribute<Detallefactura, Double> cantidad;
    public static volatile SingularAttribute<Detallefactura, Cocinero> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;

}