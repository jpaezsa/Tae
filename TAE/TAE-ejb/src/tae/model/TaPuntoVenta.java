/*
 *  Document   : TaPuntoVenta.java 
 *  Create on  : Apr 25, 2013, 7:10:18 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Entity
@Table(name = "TA_PUNTO_VENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaPuntoVenta.findAll", query = "SELECT t FROM TaPuntoVenta t")})
public class TaPuntoVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FECHA_GENERO")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "HORA_GENERO")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @JoinColumn(name = "GENERO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario genero;
    @JoinColumn(name = "SI_FOLIO", referencedColumnName = "ID")
    @ManyToOne
    private SiFolio siFolio;
    @JoinColumn(name = "SI_DIRECCION", referencedColumnName = "ID")
    @ManyToOne
    private SiDireccion siDireccion;
    @OneToMany(mappedBy = "taPuntoVenta")
    private Collection<TaVenta> taVentaCollection;

    public TaPuntoVenta() {
    }

    public TaPuntoVenta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaGenero() {
        return fechaGenero;
    }

    public void setFechaGenero(Date fechaGenero) {
        this.fechaGenero = fechaGenero;
    }

    public Date getHoraGenero() {
        return horaGenero;
    }

    public void setHoraGenero(Date horaGenero) {
        this.horaGenero = horaGenero;
    }

    public String getEliminado() {
        return eliminado;
    }

    public void setEliminado(String eliminado) {
        this.eliminado = eliminado;
    }

    public SiUsuario getGenero() {
        return genero;
    }

    public void setGenero(SiUsuario genero) {
        this.genero = genero;
    }

    public SiFolio getSiFolio() {
        return siFolio;
    }

    public void setSiFolio(SiFolio siFolio) {
        this.siFolio = siFolio;
    }

    public SiDireccion getSiDireccion() {
        return siDireccion;
    }

    public void setSiDireccion(SiDireccion siDireccion) {
        this.siDireccion = siDireccion;
    }

    @XmlTransient
    public Collection<TaVenta> getTaVentaCollection() {
        return taVentaCollection;
    }

    public void setTaVentaCollection(Collection<TaVenta> taVentaCollection) {
        this.taVentaCollection = taVentaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaPuntoVenta)) {
            return false;
        }
        TaPuntoVenta other = (TaPuntoVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.TaPuntoVenta[ id=" + id + " ]";
    }

}
