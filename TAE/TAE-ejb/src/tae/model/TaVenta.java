/*
 *  Document   : TaVenta.java 
 *  Create on  : Apr 25, 2013, 7:10:19 PM
 *  Author     : Héctor Acosta
 *  Information: For information on the use of this class, as well as bugs, updates or upgrades
 *               send an email to: hacost@hotmail.com
 *  Description: 
 *  Purpose of the class follows.
 */

package tae.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @email hacost@hotmail.com
 * @author Héctor Acosta
 */
@Entity
@Table(name = "TA_VENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaVenta.findAll", query = "SELECT t FROM TaVenta t")})
public class TaVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 12)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 10)
    @Column(name = "FOLIO_PROVEEDOR")
    private String folioProveedor;
    @Size(max = 10)
    @Column(name = "FOLIO_VENTA")
    private String folioVenta;
    @Column(name = "FECHA_GENERO")
    @Temporal(TemporalType.DATE)
    private Date fechaGenero;
    @Column(name = "HORA_GENERO")
    @Temporal(TemporalType.TIME)
    private Date horaGenero;
    @Size(max = 5)
    @Column(name = "ELIMINADO")
    private String eliminado;
    @JoinColumn(name = "TA_PUNTO_VENTA", referencedColumnName = "ID")
    @ManyToOne
    private TaPuntoVenta taPuntoVenta;
    @JoinColumn(name = "TA_PRODUCTO", referencedColumnName = "ID")
    @ManyToOne
    private TaProducto taProducto;
    @JoinColumn(name = "TA_OPERADORA", referencedColumnName = "ID")
    @ManyToOne
    private TaOperadora taOperadora;
    @JoinColumn(name = "TA_MOVIMIENTO", referencedColumnName = "ID")
    @ManyToOne
    private TaMovimiento taMovimiento;
    @JoinColumn(name = "SI_USUARIO", referencedColumnName = "ID")
    @ManyToOne
    private SiUsuario siUsuario;

    public TaVenta() {
    }

    public TaVenta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFolioProveedor() {
        return folioProveedor;
    }

    public void setFolioProveedor(String folioProveedor) {
        this.folioProveedor = folioProveedor;
    }

    public String getFolioVenta() {
        return folioVenta;
    }

    public void setFolioVenta(String folioVenta) {
        this.folioVenta = folioVenta;
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

    public TaPuntoVenta getTaPuntoVenta() {
        return taPuntoVenta;
    }

    public void setTaPuntoVenta(TaPuntoVenta taPuntoVenta) {
        this.taPuntoVenta = taPuntoVenta;
    }

    public TaProducto getTaProducto() {
        return taProducto;
    }

    public void setTaProducto(TaProducto taProducto) {
        this.taProducto = taProducto;
    }

    public TaOperadora getTaOperadora() {
        return taOperadora;
    }

    public void setTaOperadora(TaOperadora taOperadora) {
        this.taOperadora = taOperadora;
    }

    public TaMovimiento getTaMovimiento() {
        return taMovimiento;
    }

    public void setTaMovimiento(TaMovimiento taMovimiento) {
        this.taMovimiento = taMovimiento;
    }

    public SiUsuario getSiUsuario() {
        return siUsuario;
    }

    public void setSiUsuario(SiUsuario siUsuario) {
        this.siUsuario = siUsuario;
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
        if (!(object instanceof TaVenta)) {
            return false;
        }
        TaVenta other = (TaVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tae.model.TaVenta[ id=" + id + " ]";
    }

}
