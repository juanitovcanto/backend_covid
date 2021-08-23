package wildfly.backend.covid.DTO;

import java.time.LocalDate;

public class CasosNuevosDTO {

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
