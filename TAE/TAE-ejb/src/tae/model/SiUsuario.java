/*
 *  Document   : SiUsuario.java 
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
@Table(name = "SI_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiUsuario.findAll", query = "SELECT s FROM SiUsuario s")})
public class SiUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TA_PUNTO_VENTA")
    private Integer taPuntoVenta;
    @Size(max = 10)
    @Column(name = "USUARIO")
    private String usuario;
    @Size(max = 15)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "FECHA_GENERO")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "HORA_GENERO")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @OneToMany(mappedBy = "genero")
    private Collection<TaOperacion> taOperacionCollection;
    @OneToMany(mappedBy = "siUsuario")
    private Collection<TaMovimiento> taMovimientoCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<TaOperadora> taOperadoraCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<SiPais> siPaisCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<TaProducto> taProductoCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<SiDireccion> siDireccionCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<TaXml> taXmlCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<SiEstado> siEstadoCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<TaPuntoVenta> taPuntoVentaCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<SiUsuario> siUsuarioCollection;
    @JoinColumn(name = "GENERO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario genero;
    @OneToMany(mappedBy = "siUsuario")
    private Collection<TaVenta> taVentaCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<TaTipoOperacion> taTipoOperacionCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<SiFolio> siFolioCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<TaTipoMovimiento> taTipoMovimientoCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<SiMoneda> siMonedaCollection;
    @OneToMany(mappedBy = "genero")
    private Collection<SiCiudad> siCiudadCollection;

    public SiUsuario() {
    }

    public SiUsuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaPuntoVenta() {
        return taPuntoVenta;
    }

    public void setTaPuntoVenta(Integer taPuntoVenta) {
        this.taPuntoVenta = taPuntoVenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @XmlTransient
    public Collection<TaOperacion> getTaOperacionCollection() {
        return taOperacionCollection;
    }

    public void setTaOperacionCollection(Collection<TaOperacion> taOperacionCollection) {
        this.taOperacionCollection = taOperacionCollection;
    }

    @XmlTransient
    public Collection<TaMovimiento> getTaMovimientoCollection() {
        return taMovimientoCollection;
    }

    public void setTaMovimientoCollection(Collection<TaMovimiento> taMovimientoCollection) {
        this.taMovimientoCollection = taMovimientoCollection;
    }

    @XmlTransient
    public Collection<TaOperadora> getTaOperadoraCollection() {
        return taOperadoraCollection;
    }

    public void setTaOperadoraCollection(Collection<TaOperadora> taOperadoraCollection) {
        this.taOperadoraCollection = taOperadoraCollection;
    }

    @XmlTransient
    public Collection<SiPais> getSiPaisCollection() {
        return siPaisCollection;
    }

    public void setSiPaisCollection(Collection<SiPais> siPaisCollection) {
        this.siPaisCollection = siPaisCollection;
    }

    @XmlTransient
    public Collection<TaProducto> getTaProductoCollection() {
        return taProductoCollection;
    }

    public void setTaProductoCollection(Collection<TaProducto> taProductoCollection) {
        this.taProductoCollection = taProductoCollection;
    }

    @XmlTransient
    public Collection<SiDireccion> getSiDireccionCollection() {
        return siDireccionCollection;
    }

    public void setSiDireccionCollection(Collection<SiDireccion> siDireccionCollection) {
        this.siDireccionCollection = siDireccionCollection;
    }

    @XmlTransient
    public Collection<TaXml> getTaXmlCollection() {
        return taXmlCollection;
    }

    public void setTaXmlCollection(Collection<TaXml> taXmlCollection) {
        this.taXmlCollection = taXmlCollection;
    }

    @XmlTransient
    public Collection<SiEstado> getSiEstadoCollection() {
        return siEstadoCollection;
    }

    public void setSiEstadoCollection(Collection<SiEstado> siEstadoCollection) {
        this.siEstadoCollection = siEstadoCollection;
    }

    @XmlTransient
    public Collection<TaPuntoVenta> getTaPuntoVentaCollection() {
        return taPuntoVentaCollection;
    }

    public void setTaPuntoVentaCollection(Collection<TaPuntoVenta> taPuntoVentaCollection) {
        this.taPuntoVentaCollection = taPuntoVentaCollection;
    }

    @XmlTransient
    public Collection<SiUsuario> getSiUsuarioCollection() {
        return siUsuarioCollection;
    }

    public void setSiUsuarioCollection(Collection<SiUsuario> siUsuarioCollection) {
        this.siUsuarioCollection = siUsuarioCollection;
    }

    public SiUsuario getGenero() {
        return genero;
    }

    public void setGenero(SiUsuario genero) {
        this.genero = genero;
    }

    @XmlTransient
    public Collection<TaVenta> getTaVentaCollection() {
        return taVentaCollection;
    }

    public void setTaVentaCollection(Collection<TaVenta> taVentaCollection) {
        this.taVentaCollection = taVentaCollection;
    }

    @XmlTransient
    public Collection<TaTipoOperacion> getTaTipoOperacionCollection() {
        return taTipoOperacionCollection;
    }

    public void setTaTipoOperacionCollection(Collection<TaTipoOperacion> taTipoOperacionCollection) {
        this.taTipoOperacionCollection = taTipoOperacionCollection;
    }

    @XmlTransient
    public Collection<SiFolio> getSiFolioCollection() {
        return siFolioCollection;
    }

    public void setSiFolioCollection(Collection<SiFolio> siFolioCollection) {
        this.siFolioCollection = siFolioCollection;
    }

    @XmlTransient
    public Collection<TaTipoMovimiento> getTaTipoMovimientoCollection() {
        return taTipoMovimientoCollection;
    }

    public void setTaTipoMovimientoCollection(Collection<TaTipoMovimiento> taTipoMovimientoCollection) {
        this.taTipoMovimientoCollection = taTipoMovimientoCollection;
    }

    @XmlTransient
    public Collection<SiMoneda> getSiMonedaCollection() {
        return siMonedaCollection;
    }

    public void setSiMonedaCollection(Collection<SiMoneda> siMonedaCollection) {
        this.siMonedaCollection = siMonedaCollection;
    }

    @XmlTransient
    public Collection<SiCiudad> getSiCiudadCollection() {
        return siCiudadCollection;
    }

    public void setSiCiudadCollection(Collection<SiCiudad> siCiudadCollection) {
        this.siCiudadCollection = siCiudadCollection;
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
        if (!(object instanceof SiUsuario)) {
            return false;
        }
        SiUsuario other = (SiUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.SiUsuario[ id=" + id + " ]";
    }

}
