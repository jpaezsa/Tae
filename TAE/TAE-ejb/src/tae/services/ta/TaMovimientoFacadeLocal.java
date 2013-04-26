/*
 *  Document   : TaMovimientoFacadeLocal.java 
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
import tae.model.TaMovimiento;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface TaMovimientoFacadeLocal {

    void create(TaMovimiento taMovimiento);

    void edit(TaMovimiento taMovimiento);

    void remove(TaMovimiento taMovimiento);

    TaMovimiento find(Object id);

    List<TaMovimiento> findAll();

    List<TaMovimiento> findRange(int[] range);

    int count();

}
