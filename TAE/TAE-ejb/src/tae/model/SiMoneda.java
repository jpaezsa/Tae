/*
 *  Document   : SiMoneda.java 
 *  Create on  : Apr 25, 2013, 7:10:19 PM
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
@Table(name = "SI_MONEDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiMoneda.findAll", query = "SELECT s FROM SiMoneda s")})
public class SiMoneda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOMBRE")
    private Integer nombre;
    @Column(name = "FECHA_GENERO")
    private Integer fechaGenero;
    @Column(name = "HORA_GENERO")
    private Integer horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @OneToMany(mappedBy = "siMoneda")
    private Collection<TaProducto> taProductoCollection;
    @JoinColumn(name = "GENERO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario genero;

    public SiMoneda() {
    }

    public SiMoneda(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
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

    @XmlTransient
    public Collection<TaProducto> getTaProductoCollection() {
        return taProductoCollection;
    }

    public void setTaProductoCollection(Collection<TaProducto> taProductoCollection) {
        this.taProductoCollection = taProductoCollection;
    }

    public SiUsuario getGenero() {
        return genero;
    }

    public void setGenero(SiUsuario genero) {
        this.genero = genero;
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
        if (!(object instanceof SiMoneda)) {
            return false;
        }
        SiMoneda other = (SiMoneda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.SiMoneda[ id=" + id + " ]";
    }

}
