package wildfly.backend.covid.model.regionesQuery;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "Comunas", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Comunas implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "Nombre")
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_region")
    private Regiones region;

    public Comunas(long id, String nombre, Regiones region) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Regiones getRegion() {
        return region;
    }

    public void setRegion(Regiones region) {
        this.region = region;
    }


    
   
}
