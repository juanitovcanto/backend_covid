package wildfly.backend.covid.model.casosComunasQuery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.OneToMany;


@Entity
@Table(name = "Comunas", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class ComunasCC implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "Nombre")
    private String nombre;

    @OneToMany(mappedBy = "comuna",fetch = FetchType.LAZY)
    private List<CasosContagio> casosContagio = new ArrayList<>();

    public ComunasCC() {
    }

    public ComunasCC(long id, String nombre, List<CasosContagio> casosContagio) {
        this.id = id;
        this.nombre = nombre;
        this.casosContagio = casosContagio;
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

    public List<CasosContagio> getCasosContagio() {
        return casosContagio;
    }

    public void setCasosContagio(List<CasosContagio> casosContagio) {
        this.casosContagio = casosContagio;
    }





}
