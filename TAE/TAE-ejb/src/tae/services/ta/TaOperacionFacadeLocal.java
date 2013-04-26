/*
 *  Document   : TaOperacionFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:23 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.ta;

import java.util.List;
import javax.ejb.Local;
import tae.model.TaOperacion;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface TaOperacionFacadeLocal {

    void create(TaOperacion taOperacion);

    void edit(TaOperacion taOperacion);

    void remove(TaOperacion taOperacion);

    TaOperacion find(Object id);

    List<TaOperacion> findAll();

    List<TaOperacion> findRange(int[] range);

    int count();

}
