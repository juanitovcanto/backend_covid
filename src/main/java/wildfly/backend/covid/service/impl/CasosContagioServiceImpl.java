package wildfly.backend.covid.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import wildfly.backend.covid.DTO.CasosNuevosComunaDTO;
import wildfly.backend.covid.Mapper.CasosContagioMapper;
import wildfly.backend.covid.model.casosComunasQuery.ComunasCC;
import wildfly.backend.covid.service.CasosContagioService;

public class CasosContagioServiceImpl implements CasosContagioService{

    @Context
    UriInfo uriInfo;
    
    @Override
    public List<CasosNuevosComunaDTO> casosNuevosPorComuna(long idComuna){

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "primary" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        CriteriaBuilder criteriaBuilder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();

        
        try{

            Root<ComunasCC> from = criteriaQuery.from(ComunasCC.class);
            CriteriaQuery<Object> select = criteriaQuery.select(from);
            select.where(criteriaBuilder.equal(from.get("id"), idComuna));
            TypedQuery<Object> typedQuery = entitymanager.createQuery(select);
            List<Object> resultList = typedQuery.getResultList();
    
            if (resultList.isEmpty()){
                return null;
            }
            
            List<CasosNuevosComunaDTO> resultado = CasosContagioMapper.convertToDTO(resultList);
            
            return resultado;

        }
        finally{
            entitymanager.close( );
            emfactory.close( );
        }
       




    }
    
}
