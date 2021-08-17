package wildfly.backend.covid.controller;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.UriInfo;

import wildfly.backend.covid.DTO.ComunasDTO;
import wildfly.backend.covid.service.ComunasService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@Path("/comunas")
@RequestScoped
public class ComunasController {
    @Inject
    ComunasService comunasService;
    
    @Context
    private UriInfo uriInfo;

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/{idRegion}")
    public List<ComunasDTO> getComunasByRegion(@PathParam("idRegion") Long idRegion){
        return comunasService.findByRegion(idRegion);
    }
}
