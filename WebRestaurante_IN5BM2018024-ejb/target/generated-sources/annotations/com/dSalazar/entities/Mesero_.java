package com.dSalazar.entities;

import com.dSalazar.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:16:04")
@StaticMetamodel(Mesero.class)
public class Mesero_ { 

    public static volatile SingularAttribute<Mesero, String> calificacion;
    public static volatile SingularAttribute<Mesero, Integer> idarea;
    public static volatile SingularAttribute<Mesero, String> nombremesero;
    public static volatile ListAttribute<Mesero, Factura> facturaList;
    public static volatile SingularAttribute<Mesero, String> apellidomesero;
    public static volatile SingularAttribute<Mesero, Integer> idmesero;
    public static volatile SingularAttribute<Mesero, String> edad;

}