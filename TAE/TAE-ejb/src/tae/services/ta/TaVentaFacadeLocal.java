/*
 *  Document   : TaVentaFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:26 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.ta;

import java.util.List;
import javax.ejb.Local;
import tae.model.TaVenta;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface TaVentaFacadeLocal {

    void create(TaVenta taVenta);

    void edit(TaVenta taVenta);

    void remove(TaVenta taVenta);

    TaVenta find(Object id);

    List<TaVenta> findAll();

    List<TaVenta> findRange(int[] range);

    int count();

}
