/*
 *  Document   : SiCiudadFacade.java 
 *  Create on  : Apr 25, 2013, 7:12:20 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.system.impl;

import tae.services.system.SiCiudadFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tae.model.SiCiudad;
import tae.services.AbstractFacade;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Stateless
public class SiCiudadFacade extends AbstractFacade<SiCiudad> implements SiCiudadFacadeLocal {
    @PersistenceContext(unitName = "TAE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SiCiudadFacade() {
        super(SiCiudad.class);
    }

}
