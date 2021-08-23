package wildfly.backend.covid.model.casosComunasQuery;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import javax.persistence.ManyToOne;

@Entity
@Table(name = "Casos_Comunas", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class CasosContagio implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_comuna")
    private ComunasCC comuna;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Cantidad")
    private int cantidad;


    public CasosContagio(){

    }
    
    public CasosContagio( ComunasCC comuna, Date fecha, int cantidad) {
        this.comuna = comuna;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }


    public ComunasCC getComuna() {
        return comuna;
    }

    public void setComuna(ComunasCC comuna) {
        this.comuna = comuna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
