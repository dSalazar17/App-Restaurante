/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dSalazar.sessionsbeans;

import com.dSalazar.entities.Cocinero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dylan Salazar
 */
@Local
public interface CocineroFacadeLocal {

    void create(Cocinero cocinero);

    void edit(Cocinero cocinero);

    void remove(Cocinero cocinero);

    Cocinero find(Object id);

    List<Cocinero> findAll();

    List<Cocinero> findRange(int[] range);

    int count();
    
}
