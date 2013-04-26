/*
 *  Document   : SiCiudadFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:20 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.system;

import java.util.List;
import javax.ejb.Local;
import tae.model.SiCiudad;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface SiCiudadFacadeLocal {

    void create(SiCiudad siCiudad);

    void edit(SiCiudad siCiudad);

    void remove(SiCiudad siCiudad);

    SiCiudad find(Object id);

    List<SiCiudad> findAll();

    List<SiCiudad> findRange(int[] range);

    int count();

}
