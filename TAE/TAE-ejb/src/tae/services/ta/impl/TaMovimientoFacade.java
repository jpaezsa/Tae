/*
 *  Document   : TaMovimientoFacade.java 
 *  Create on  : Apr 25, 2013, 7:12:23 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.ta.impl;

import tae.services.ta.TaMovimientoFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tae.model.TaMovimiento;
import tae.services.AbstractFacade;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Stateless
public class TaMovimientoFacade extends AbstractFacade<TaMovimiento> implements TaMovimientoFacadeLocal {
    @PersistenceContext(unitName = "TAE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaMovimientoFacade() {
        super(TaMovimiento.class);
    }

}
