package wildfly.backend.covid.DTO;

import java.io.Serializable;

public class ComunasDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private long id;
    private String nombre;

    public ComunasDTO(){

    }


    
    public ComunasDTO(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

   
    
}
