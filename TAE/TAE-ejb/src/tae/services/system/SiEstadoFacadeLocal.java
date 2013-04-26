/*
 *  Document   : SiEstadoFacadeLocal.java 
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
import tae.model.SiEstado;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface SiEstadoFacadeLocal {

    void create(SiEstado siEstado);

    void edit(SiEstado siEstado);

    void remove(SiEstado siEstado);

    SiEstado find(Object id);

    List<SiEstado> findAll();

    List<SiEstado> findRange(int[] range);

    int count();

}
