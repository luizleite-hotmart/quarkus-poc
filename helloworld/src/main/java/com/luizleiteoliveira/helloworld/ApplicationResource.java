package com.luizleiteoliveira.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ApplicationResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("who") final String who) {
        return "hello "+ who;
    }
}