/*
 *  Document   : SiUsuarioFacadeLocal.java 
 *  Create on  : Apr 25, 2013, 7:12:23 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.services.system;

import java.util.List;
import javax.ejb.Local;
import tae.model.SiUsuario;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface SiUsuarioFacadeLocal {

    void create(SiUsuario siUsuario);

    void edit(SiUsuario siUsuario);

    void remove(SiUsuario siUsuario);

    SiUsuario find(Object id);

    List<SiUsuario> findAll();

    List<SiUsuario> findRange(int[] range);

    int count();

}
