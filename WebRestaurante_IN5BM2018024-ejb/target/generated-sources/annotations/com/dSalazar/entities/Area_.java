package com.dSalazar.entities;

import com.dSalazar.entities.Detallefactura;
import com.dSalazar.entities.Mesa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-17T11:16:04")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Mesa> idmesa;
    public static volatile SingularAttribute<Area, Integer> idarea;
    public static volatile SingularAttribute<Area, String> nombrearea;
    public static volatile ListAttribute<Area, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Area, Detallefactura> detallefacturaIddetallefactura;

}