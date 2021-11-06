package wildfly.backend.covid.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CasosNuevosComunaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nombre;
    private List<CasosNuevosDTO> casosNuevos = new ArrayList<>();

    
    public CasosNuevosComunaDTO() {
    }


    public CasosNuevosComunaDTO(long id, String nombre, List<CasosNuevosDTO> casosNuevos) {
        this.id = id;
        this.nombre = nombre;
        this.casosNuevos = casosNuevos;
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


    public List<CasosNuevosDTO> getCasosNuevos() {
        return casosNuevos;
    }


    public void setCasosNuevos(List<CasosNuevosDTO> casosNuevos) {
        this.casosNuevos = casosNuevos;
    }


    
}
