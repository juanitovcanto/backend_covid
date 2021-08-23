package wildfly.backend.covid.Mapper;

import java.util.ArrayList;
import java.util.List;

import wildfly.backend.covid.DTO.CasosNuevosComunaDTO;
import wildfly.backend.covid.DTO.CasosNuevosDTO;
import wildfly.backend.covid.model.casosComunasQuery.CasosContagio;
import wildfly.backend.covid.model.casosComunasQuery.ComunasCC;



public class CasosContagioMapper {
    public static List<CasosNuevosComunaDTO> convertToDTO(List<Object> casosNuevosQuery){

        
        List<CasosNuevosComunaDTO> listaCasosNuevos = new ArrayList<>( casosNuevosQuery.size());
        for (Object cn:casosNuevosQuery){

            CasosNuevosComunaDTO comunaDTO = new CasosNuevosComunaDTO();
            ComunasCC comunaEntidad = (ComunasCC)cn;
            comunaDTO.setId(comunaEntidad.getId());
            comunaDTO.setNombre(comunaEntidad.getNombre());
            comunaDTO.setCasosNuevos(listaCasosEntidadHaciaDTO(comunaEntidad.getCasosContagio())); 

            listaCasosNuevos.add(comunaDTO);
        }
               
        
        

        return listaCasosNuevos;
    }

    public static List<CasosNuevosDTO> listaCasosEntidadHaciaDTO(List<CasosContagio> casosQuery){

        List<CasosNuevosDTO> listaCasos = new ArrayList<>(casosQuery.size());

        for (CasosContagio cc:casosQuery){
            
            CasosNuevosDTO casosNuevosDTO = new CasosNuevosDTO();
            CasosContagio casosContagioEntidad = (CasosContagio)cc;
            casosNuevosDTO.setFecha(casosContagioEntidad.getFecha());
            casosNuevosDTO.setCantidad(casosContagioEntidad.getCantidad());

            listaCasos.add(casosNuevosDTO);

        }
        return listaCasos;
    }

    
}
