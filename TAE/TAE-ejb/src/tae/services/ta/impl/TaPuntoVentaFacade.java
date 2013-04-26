/*
 *  Document   : TaPuntoVentaFacade.java 
 *  Create on  : Apr 25, 2013, 7:12:24 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.ta.impl;

import tae.services.ta.TaPuntoVentaFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tae.model.TaPuntoVenta;
import tae.services.AbstractFacade;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Stateless
public class TaPuntoVentaFacade extends AbstractFacade<TaPuntoVenta> implements TaPuntoVentaFacadeLocal {
    @PersistenceContext(unitName = "TAE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaPuntoVentaFacade() {
        super(TaPuntoVenta.class);
    }

}
