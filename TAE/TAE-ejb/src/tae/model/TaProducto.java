/*
 *  Document   : TaProducto.java 
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
@Table(name = "TA_PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaProducto.findAll", query = "SELECT t FROM TaProducto t")})
public class TaProducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 10)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "MONTO")
    private Long monto;
    @Column(name = "FECHA_GENERO")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "HORA_GENERO")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @JoinColumn(name = "TA_OPERADORA", referencedColumnName = "ID")
    @ManyToOne
    private TaOperadora taOperadora;
    @JoinColumn(name = "GENERO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario genero;
    @JoinColumn(name = "SI_MONEDA", referencedColumnName = "ID")
    @ManyToOne
    private SiMoneda siMoneda;
    @OneToMany(mappedBy = "taProducto")
    private Collection<TaVenta> taVentaCollection;

    public TaProducto() {
    }

    public TaProducto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
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

    public TaOperadora getTaOperadora() {
        return taOperadora;
    }

    public void setTaOperadora(TaOperadora taOperadora) {
        this.taOperadora = taOperadora;
    }

    public SiUsuario getGenero() {
        return genero;
    }

    public void setGenero(SiUsuario genero) {
        this.genero = genero;
    }

    public SiMoneda getSiMoneda() {
        return siMoneda;
    }

    public void setSiMoneda(SiMoneda siMoneda) {
        this.siMoneda = siMoneda;
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
        if (!(object instanceof TaProducto)) {
            return false;
        }
        TaProducto other = (TaProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.TaProducto[ id=" + id + " ]";
    }

}
