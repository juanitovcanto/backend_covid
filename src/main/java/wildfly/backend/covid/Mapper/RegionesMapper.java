package wildfly.backend.covid.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjIntConsumer;

import wildfly.backend.covid.DTO.ComunasDTO;
import wildfly.backend.covid.DTO.RegionesDTO;
import wildfly.backend.covid.model.Comunas;
import wildfly.backend.covid.model.Regiones;

public class RegionesMapper {
    
    
    public static List<RegionesDTO> convertToDTO(List<Object> regionQuery){

        
        List<RegionesDTO> listaRegiones = new ArrayList<>( regionQuery.size());

        for (Object re:regionQuery){
            RegionesDTO regionDTO = new RegionesDTO();
            Regiones regionEntidad = (Regiones)re;

            regionDTO.setId(regionEntidad.getId());
            regionDTO.setNombre(regionEntidad.getNombre());
            
            regionDTO.setComunas(listaComunasEntidadHaciaDTO(regionEntidad.getComunas()));

            listaRegiones.add(regionDTO);
        }
        
        

        return listaRegiones;
    }
    
    public static List<ComunasDTO> listaComunasEntidadHaciaDTO(List<Comunas> comunasSubQuery){

        List<ComunasDTO> listaComunas = new ArrayList<>( comunasSubQuery.size());

        for (Comunas co:comunasSubQuery){

            ComunasDTO comunasDTO = new ComunasDTO();
            Comunas comunaEntidad = (Comunas)co;

            comunasDTO.setId(comunaEntidad.getId());
            comunasDTO.setNombre(comunaEntidad.getNombre());

            listaComunas.add(comunasDTO);

        }

        return listaComunas;

    }
}
