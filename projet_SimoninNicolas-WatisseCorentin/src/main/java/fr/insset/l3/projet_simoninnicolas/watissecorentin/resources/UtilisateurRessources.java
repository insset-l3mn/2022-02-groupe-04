/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/* package fr.insset.l3.projet_simoninnicolas.watissecorentin.resources;

import fr.insset.l3.projet_simoninnicolas.watissecorentin.entities.errorMessage;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.registry.infomodel.User;

@Path("/user")
public class UtilisateurRessources {
    @EJB
    private GestionaryUser gestionnaireUser;
   
    @POST
    @Consumes("application/x-www-form-urlencoder")
    @Path("/login")
    public Object loginUtilisateur (@FormParam("username") String username, @FormParam("password") String password){
          if (username != null && password != null){
            User utilisateur = gestionnaireUser.requestUser(username, password);
            if (utilisateur != null) {
                return utilisateur;
            } else {
                return new errorMessage("error","Username or password incorrect");
            }
          } else {
              return new errorMessage("error", "not all information is filled in");
          }  
    }
    
}
*/