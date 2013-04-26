/*
 *  Document   : TaXmlFacadeLocal.java 
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
import tae.model.TaXml;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Local
public interface TaXmlFacadeLocal {

    void create(TaXml taXml);

    void edit(TaXml taXml);

    void remove(TaXml taXml);

    TaXml find(Object id);

    List<TaXml> findAll();

    List<TaXml> findRange(int[] range);

    int count();

}
