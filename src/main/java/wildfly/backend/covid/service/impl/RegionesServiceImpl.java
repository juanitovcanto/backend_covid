package wildfly.backend.covid.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import wildfly.backend.covid.DTO.RegionesDTO;
import wildfly.backend.covid.service.RegionesService;

public class RegionesServiceImpl implements RegionesService{
    @Inject
    private EntityManager em;

    @Context
    UriInfo uriInfo;
    
    @Override
    public List<RegionesDTO> findAll() {
        TypedQuery<RegionesDTO> regiones = em.createQuery("SELECT "+
        "new wildfly.backend.covid.DTO.RegionesDTO(r.id , r.nombre ,wildfly.backend.covid.DTO.ComunasDTO(c.id,c.nombre)) " +
        " FROM Regiones r JOIN fetch r.comunas c"
        ,RegionesDTO.class);
        return regiones.getResultList();
    }

}
