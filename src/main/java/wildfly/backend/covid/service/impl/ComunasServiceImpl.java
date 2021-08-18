package wildfly.backend.covid.service.impl;

import wildfly.backend.covid.DTO.ComunasDTO;
import wildfly.backend.covid.service.ComunasService;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;


public class ComunasServiceImpl implements ComunasService{
    @Inject
    private EntityManager em;

    @Context
    UriInfo uriInfo;
    
    @Override
    public List<ComunasDTO> findByRegion(Long idRegion){
        TypedQuery<ComunasDTO> comunas = em.createQuery("Select new wildfly.backend.covid.DTO.ComunasDTO(c.id ,c.nombre ,r.id )" +
        " from Comunas c JOIN c.idRegion r " +
        "where r.id = :idRegion" ,ComunasDTO.class)
        .setParameter("idRegion", idRegion);
        return comunas.getResultList();
    }
    
}
