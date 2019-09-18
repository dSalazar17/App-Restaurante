package com.dSalazar.entities;

import com.dSalazar.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:16:04")
@StaticMetamodel(Platos.class)
public class Platos_ { 

    public static volatile SingularAttribute<Platos, Double> precioplato;
    public static volatile SingularAttribute<Platos, String> tipoplato;
    public static volatile ListAttribute<Platos, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Platos, Integer> idplatos;
    public static volatile SingularAttribute<Platos, String> nombreplato;

}