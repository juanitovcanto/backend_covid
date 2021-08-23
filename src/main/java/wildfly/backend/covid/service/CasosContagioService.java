package wildfly.backend.covid.service;

import java.util.List;

import javax.ejb.Local;

import wildfly.backend.covid.DTO.CasosNuevosComunaDTO;

@Local
public interface CasosContagioService {
    List<CasosNuevosComunaDTO> casosNuevosPorComuna(long idComuna);
    
}
