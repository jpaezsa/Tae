/*
 *  Document   : TaPuntoVentaFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:24 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.ta;

import java.util.List;
import javax.ejb.Local;
import tae.model.TaPuntoVenta;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface TaPuntoVentaFacadeLocal {

    void create(TaPuntoVenta taPuntoVenta);

    void edit(TaPuntoVenta taPuntoVenta);

    void remove(TaPuntoVenta taPuntoVenta);

    TaPuntoVenta find(Object id);

    List<TaPuntoVenta> findAll();

    List<TaPuntoVenta> findRange(int[] range);

    int count();

}
