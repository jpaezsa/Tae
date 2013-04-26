/*
 *  Document   : TaTipoOperacionFacade.java 
 *  Create on  : Apr 25, 2013, 7:12:25 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.ta.impl;

import tae.services.ta.TaTipoOperacionFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tae.model.TaTipoOperacion;
import tae.services.AbstractFacade;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Stateless
public class TaTipoOperacionFacade extends AbstractFacade<TaTipoOperacion> implements TaTipoOperacionFacadeLocal {
    @PersistenceContext(unitName = "TAE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaTipoOperacionFacade() {
        super(TaTipoOperacion.class);
    }

}
