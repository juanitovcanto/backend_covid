package wildfly.backend.covid.service;

import java.util.List;

import javax.ejb.Local;

import wildfly.backend.covid.DTO.ComunasDTO;

@Local
public interface ComunasService {
    List<ComunasDTO> findByRegion(Long idRegion);
}
