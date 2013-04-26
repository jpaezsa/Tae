/*
 *  Document   : TaMovimiento.java 
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
@Table(name = "TA_MOVIMIENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaMovimiento.findAll", query = "SELECT t FROM TaMovimiento t")})
public class TaMovimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "GENERO")
    private Integer genero;
    @Column(name = "FECHA_GENERO")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "HORA_GENERO")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @JoinColumn(name = "TA_XML", referencedColumnName = "ID")
    @ManyToOne
    private TaXml taXml;
    @JoinColumn(name = "TA_TIPO_MOVIMIENTO", referencedColumnName = "ID")
    @ManyToOne
    private TaTipoMovimiento taTipoMovimiento;
    @JoinColumn(name = "SI_USUARIO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario siUsuario;
    @OneToMany(mappedBy = "taMovimiento")
    private Collection<TaVenta> taVentaCollection;

    public TaMovimiento() {
    }

    public TaMovimiento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
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

    public TaXml getTaXml() {
        return taXml;
    }

    public void setTaXml(TaXml taXml) {
        this.taXml = taXml;
    }

    public TaTipoMovimiento getTaTipoMovimiento() {
        return taTipoMovimiento;
    }

    public void setTaTipoMovimiento(TaTipoMovimiento taTipoMovimiento) {
        this.taTipoMovimiento = taTipoMovimiento;
    }

    public SiUsuario getSiUsuario() {
        return siUsuario;
    }

    public void setSiUsuario(SiUsuario siUsuario) {
        this.siUsuario = siUsuario;
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
        if (!(object instanceof TaMovimiento)) {
            return false;
        }
        TaMovimiento other = (TaMovimiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.TaMovimiento[ id=" + id + " ]";
    }

}
