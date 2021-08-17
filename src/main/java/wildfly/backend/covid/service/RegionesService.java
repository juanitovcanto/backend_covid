package wildfly.backend.covid.service;

import java.util.List;

import javax.ejb.Local;

import wildfly.backend.covid.DTO.RegionesDTO;


@Local
public interface RegionesService {
    List<RegionesDTO> findAll();
}
