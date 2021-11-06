package wildfly.backend.covid.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class RegionesDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    private long id;
    private String nombre;
    private List<ComunasDTO> comunas = new ArrayList<>();
    
    
    public RegionesDTO(){

    }

    public RegionesDTO(long id, String nombre, List<ComunasDTO> comunas) {
        this.id = id;
        this.nombre = nombre;
        this.comunas = comunas;
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

    public List<ComunasDTO> getComunas() {
        return comunas;
    }

    public void setComunas(List<ComunasDTO> comunas) {
        this.comunas = comunas;
    }

    

}
