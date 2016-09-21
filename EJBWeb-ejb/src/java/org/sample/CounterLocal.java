/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample;

import javax.ejb.Local;

/**
 *
 * @author g
 */
@Local
public interface CounterLocal {

    void setCounter(long i);

    long getCount();
    
}
