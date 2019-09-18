package com.dSalazar.entities;

import com.dSalazar.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:16:04")
@StaticMetamodel(Cocinero.class)
public class Cocinero_ { 

    public static volatile SingularAttribute<Cocinero, String> apellidoco;
    public static volatile ListAttribute<Cocinero, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocinero, Integer> idcocinero;
    public static volatile SingularAttribute<Cocinero, String> nomcroco;
    public static volatile SingularAttribute<Cocinero, String> especialidad;

}