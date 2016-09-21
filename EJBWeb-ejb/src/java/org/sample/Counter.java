/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample;

import javax.ejb.Stateless;

/**
 *
 * @author g
 */
@Stateless
public class Counter implements CounterLocal {




//    @PersistenceContext(unitName = "EJBWeb-ejbPU")
//    private EntityManager em;
    long c=0;

    @Override
    public void setCounter(long i) {
        c=i;

    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public long getCount() {
//        c=em.createQuery("select * from counselor").getMaxResults();
        
        return c;
    }

//    public void persist(Object object) {
//        em.persist(object);
//    }


}
