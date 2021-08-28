package wildfly.backend.covid.controller;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import wildfly.backend.covid.DTO.CasosNuevosComunaDTO;
import wildfly.backend.covid.service.CasosContagioService;

@Stateful
@Path("/casos")
public class CasosContagioController {
    @Inject
    CasosContagioService casosContagioService;

    @Context
    private UriInfo uriInfo;

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/comuna/{idComuna}")
    public Response getComunasByRegion(@PathParam("idComuna") Long idComuna){
        if (idComuna == null){
            return Response.serverError().entity("El valor no puede estar vacio").build();
        }
        List<CasosNuevosComunaDTO> listaComunasQuery = casosContagioService.casosNuevosPorComuna(idComuna);
        if (listaComunasQuery == null){
            return Response.status(Response.Status.NOT_FOUND).entity("comuna no encontrada").type(MediaType.APPLICATION_JSON).build();
        }
        return Response.ok(listaComunasQuery).build();
    }
}
