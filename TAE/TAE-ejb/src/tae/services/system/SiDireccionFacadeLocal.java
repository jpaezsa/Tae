/*
 *  Document   : SiDireccionFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:21 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.system;

import java.util.List;
import javax.ejb.Local;
import tae.model.SiDireccion;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface SiDireccionFacadeLocal {

    void create(SiDireccion siDireccion);

    void edit(SiDireccion siDireccion);

    void remove(SiDireccion siDireccion);

    SiDireccion find(Object id);

    List<SiDireccion> findAll();

    List<SiDireccion> findRange(int[] range);

    int count();

}
