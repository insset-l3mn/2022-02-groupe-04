/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Nicolas
 */
public class PersonneResource {
@Path("/personne")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Personne getPerson() {
      return // some way to return a Person instance
   }
}