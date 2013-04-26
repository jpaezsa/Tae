/*
 *  Document   : SiFolioFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:22 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.system;

import java.util.List;
import javax.ejb.Local;
import tae.model.SiFolio;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface SiFolioFacadeLocal {

    void create(SiFolio siFolio);

    void edit(SiFolio siFolio);

    void remove(SiFolio siFolio);

    SiFolio find(Object id);

    List<SiFolio> findAll();

    List<SiFolio> findRange(int[] range);

    int count();

}
