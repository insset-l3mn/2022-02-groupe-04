/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Nicolas
 */
@Path("/hello")
public class HelloResource {
    
    @GET
    public String sayHello () {
      return "Hello World" ;
        }
        
    @GET 
    @Produces ( MediaType . TEXT_PLAIN ) 
    @Path ( "/{name}" ) 
    public String doGreeting ( @PathParam ( "name" ) String someValue ,  @QueryParam ( "language" ) String language )  { 
    return  "Hello "  + someValue +  " avec langue "  + language ; 
    } 
}

