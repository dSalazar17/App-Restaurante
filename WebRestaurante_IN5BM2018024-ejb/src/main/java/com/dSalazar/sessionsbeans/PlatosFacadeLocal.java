/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dSalazar.sessionsbeans;

import com.dSalazar.entities.Platos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dylan Salazar
 */
@Local
public interface PlatosFacadeLocal {

    void create(Platos platos);

    void edit(Platos platos);

    void remove(Platos platos);

    Platos find(Object id);

    List<Platos> findAll();

    List<Platos> findRange(int[] range);

    int count();
    
}
