package com.example.my_ejb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ejb.Stateless;

@Path("/hello-world")
@Stateless
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, Fouad Saba";
    }
}