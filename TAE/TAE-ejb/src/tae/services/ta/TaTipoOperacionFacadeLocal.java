/*
 *  Document   : TaTipoOperacionFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:25 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.ta;

import java.util.List;
import javax.ejb.Local;
import tae.model.TaTipoOperacion;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface TaTipoOperacionFacadeLocal {

    void create(TaTipoOperacion taTipoOperacion);

    void edit(TaTipoOperacion taTipoOperacion);

    void remove(TaTipoOperacion taTipoOperacion);

    TaTipoOperacion find(Object id);

    List<TaTipoOperacion> findAll();

    List<TaTipoOperacion> findRange(int[] range);

    int count();

}
