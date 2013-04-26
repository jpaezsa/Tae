/*
 *  Document   : SiPais.java 
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Entity
@Table(name = "SI_PAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiPais.findAll", query = "SELECT s FROM SiPais s")})
public class SiPais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 128)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "FECHA_GENERO")
    private Integer fechaGenero;
    @Column(name = "HORA_GENERO")
    private Integer horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @JoinColumn(name = "GENERO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario genero;
    @OneToMany(mappedBy = "siPais")
    private Collection<SiDireccion> siDireccionCollection;
    @OneToMany(mappedBy = "siPais")
    private Collection<SiEstado> siEstadoCollection;
    @OneToMany(mappedBy = "siPais")
    private Collection<SiCiudad> siCiudadCollection;

    public SiPais() {
    }

    public SiPais(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaGenero() {
        return fechaGenero;
    }

    public void setFechaGenero(Integer fechaGenero) {
        this.fechaGenero = fechaGenero;
    }

    public Integer getHoraGenero() {
        return horaGenero;
    }

    public void setHoraGenero(Integer horaGenero) {
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

    @XmlTransient
    public Collection<SiDireccion> getSiDireccionCollection() {
        return siDireccionCollection;
    }

    public void setSiDireccionCollection(Collection<SiDireccion> siDireccionCollection) {
        this.siDireccionCollection = siDireccionCollection;
    }

    @XmlTransient
    public Collection<SiEstado> getSiEstadoCollection() {
        return siEstadoCollection;
    }

    public void setSiEstadoCollection(Collection<SiEstado> siEstadoCollection) {
        this.siEstadoCollection = siEstadoCollection;
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
        if (!(object instanceof SiPais)) {
            return false;
        }
        SiPais other = (SiPais) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.SiPais[ id=" + id + " ]";
    }

}
