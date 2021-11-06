package wildfly.backend.covid.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;


import wildfly.backend.covid.DTO.RegionesDTO;
import wildfly.backend.covid.Mapper.RegionesMapper;
import wildfly.backend.covid.model.regionesQuery.Regiones;
import wildfly.backend.covid.service.RegionesService;

@Singleton
@Local(RegionesService.class)
public class RegionesServiceImpl implements RegionesService{


    @Context
    UriInfo uriInfo;
    
    @Override
    public List<RegionesDTO> findAll() {
        

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "primary" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Regiones> from = criteriaQuery.from(Regiones.class);

        CriteriaQuery<Object> select = criteriaQuery.select(from);
        
        TypedQuery<Object> typedQuery = entitymanager.createQuery(select);

        List<Object> resultList = typedQuery.getResultList();

        List<RegionesDTO> resultado = new ArrayList<>();
        resultado = RegionesMapper.convertToDTO(resultList);

        
        entitymanager.close( );
        emfactory.close( );

        
        return resultado;

    }

}
