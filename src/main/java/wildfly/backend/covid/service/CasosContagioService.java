package wildfly.backend.covid.service;

import java.util.List;


import wildfly.backend.covid.DTO.CasosNuevosComunaDTO;

public interface CasosContagioService {
    List<CasosNuevosComunaDTO> casosNuevosPorComuna(long idComuna);
    
}
