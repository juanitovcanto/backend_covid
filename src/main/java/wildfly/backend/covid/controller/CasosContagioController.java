package wildfly.backend.covid.controller;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.UriInfo;

import wildfly.backend.covid.DTO.CasosNuevosComunaDTO;
import wildfly.backend.covid.service.CasosContagioService;

@Path("/casos")
@RequestScoped

public class CasosContagioController {
    @Inject
    CasosContagioService casosContagioService;

    @Context
    private UriInfo uriInfo;

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/comuna/{idComuna}")
    public List<CasosNuevosComunaDTO> getComunasByRegion(@PathParam("idComuna") Long idComuna){
        return casosContagioService.casosNuevosPorComuna(idComuna);
    }
}
