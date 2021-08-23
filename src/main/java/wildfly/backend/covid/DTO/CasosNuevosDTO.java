package wildfly.backend.covid.DTO;

import java.util.Date;

public class CasosNuevosDTO {

    private Date fecha;
    private int cantidad;

    public CasosNuevosDTO(){

    }
    
    public CasosNuevosDTO( Date fecha, int cantidad) {
        this.fecha = fecha;
        this.cantidad = cantidad;
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
