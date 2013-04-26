/*
 *  Document   : SiMonedaFacade.java 
 *  Create on  : Apr 25, 2013, 7:12:22 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.system.impl;

import tae.services.system.SiMonedaFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tae.model.SiMoneda;
import tae.services.AbstractFacade;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Stateless
public class SiMonedaFacade extends AbstractFacade<SiMoneda> implements SiMonedaFacadeLocal {
    @PersistenceContext(unitName = "TAE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SiMonedaFacade() {
        super(SiMoneda.class);
    }

}
