/*
 *  Document   : SiDireccion.java 
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
@Table(name = "SI_DIRECCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiDireccion.findAll", query = "SELECT s FROM SiDireccion s")})
public class SiDireccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 128)
    @Column(name = "MUNICIPIO")
    private String municipio;
    @Size(max = 128)
    @Column(name = "COLONIA")
    private String colonia;
    @Size(max = 128)
    @Column(name = "CALLE")
    private String calle;
    @Size(max = 10)
    @Column(name = "NUMERO_EXTERIOR")
    private String numeroExterior;
    @Size(max = 10)
    @Column(name = "NUMERO_INTERIOR")
    private String numeroInterior;
    @Size(max = 10)
    @Column(name = "CODIGO_POSTAL")
    private String codigoPostal;
    @Column(name = "FECHA_GENERO")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "HORA_GENERO")
    @Temporal(TemporalType.DATE)
    private Date horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @JoinColumn(name = "GENERO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario genero;
    @JoinColumn(name = "SI_PAIS", referencedColumnName = "ID")
    @ManyToOne
    private SiPais siPais;
    @JoinColumn(name = "SI_ESTADO", referencedColumnName = "ID")
    @ManyToOne
    private SiEstado siEstado;
    @JoinColumn(name = "SI_CIUDAD", referencedColumnName = "ID")
    @ManyToOne
    private SiCiudad siCiudad;
    @OneToMany(mappedBy = "siDireccion")
    private Collection<TaPuntoVenta> taPuntoVentaCollection;

    public SiDireccion() {
    }

    public SiDireccion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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

    public SiPais getSiPais() {
        return siPais;
    }

    public void setSiPais(SiPais siPais) {
        this.siPais = siPais;
    }

    public SiEstado getSiEstado() {
        return siEstado;
    }

    public void setSiEstado(SiEstado siEstado) {
        this.siEstado = siEstado;
    }

    public SiCiudad getSiCiudad() {
        return siCiudad;
    }

    public void setSiCiudad(SiCiudad siCiudad) {
        this.siCiudad = siCiudad;
    }

    @XmlTransient
    public Collection<TaPuntoVenta> getTaPuntoVentaCollection() {
        return taPuntoVentaCollection;
    }

    public void setTaPuntoVentaCollection(Collection<TaPuntoVenta> taPuntoVentaCollection) {
        this.taPuntoVentaCollection = taPuntoVentaCollection;
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
        if (!(object instanceof SiDireccion)) {
            return false;
        }
        SiDireccion other = (SiDireccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.SiDireccion[ id=" + id + " ]";
    }

}
