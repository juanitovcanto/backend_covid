package wildfly.backend.covid.service;

import java.util.List;


import wildfly.backend.covid.DTO.RegionesDTO;

public interface RegionesService {
    List<RegionesDTO> findAll();
}
