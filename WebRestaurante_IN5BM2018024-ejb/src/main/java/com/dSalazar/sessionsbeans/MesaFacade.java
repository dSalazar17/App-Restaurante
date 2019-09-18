/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dSalazar.sessionsbeans;

import com.dSalazar.entities.Mesa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dylan Salazar
 */
@Stateless
public class MesaFacade extends AbstractFacade<Mesa> implements MesaFacadeLocal {

    @PersistenceContext(unitName = "WebRestaurante_IN5BM_2018024PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MesaFacade() {
        super(Mesa.class);
    }
    
}
