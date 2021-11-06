package wildfly.backend.covid.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.json.bind.annotation.JsonbDateFormat;



public class CasosNuevosDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    
    private LocalDate fecha;
    private int cantidad;

    public CasosNuevosDTO(){

    }
    
    public CasosNuevosDTO( LocalDate fecha, int cantidad) {
        this.fecha = fecha;
        this.cantidad = cantidad;
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    
    
}
