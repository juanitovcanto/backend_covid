package wildfly.backend.covid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import javax.xml.bind.annotation.XmlRootElement;



@Entity
@XmlRootElement
@Table(name = "Regiones", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Regiones implements Serializable{
    private static final long serialVersionUID = 1L;



    @Id
    private Long id;

    @Column(name = "Nombre")
    private String nombre;

    @OneToMany(mappedBy = "region",orphanRemoval = true)
    private List<Comunas> comunas = new ArrayList<>();
    
    public Regiones(){
        
    }

    public Regiones(Long id, String nombre, List<Comunas> comunas) {
        this.id = id;
        this.nombre = nombre;
        this.comunas = comunas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Comunas> getComunas() {
        return comunas;
    }

    public void setComunas(List<Comunas> comunas) {
        this.comunas = comunas;
    }

    
}
