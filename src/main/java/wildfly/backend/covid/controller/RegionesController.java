package wildfly.backend.covid.controller;


import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import javax.ws.rs.core.UriInfo;
import javax.inject.Inject;
import javax.inject.Singleton;

import wildfly.backend.covid.service.RegionesService;
import wildfly.backend.covid.DTO.RegionesDTO;

@Path("/regiones")
@Singleton
public class RegionesController {
    @Inject
    RegionesService regionesService;
    
    @Context
    private UriInfo uriInfo;

    @GET
    @Produces(APPLICATION_JSON)
    public List<RegionesDTO> getAllRegiones(){
        return regionesService.findAll();
    }

}
