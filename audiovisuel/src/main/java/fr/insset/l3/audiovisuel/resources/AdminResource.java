/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.audiovisuel.resources;

import fr.insset.l3.audiovisuel.entities.User;
import java.util.List;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Nicolas
 */
@DataSourceDefinition(
        className = "com.mysql.cj.jdbc.MysqlDataSource",
        name = "java:app/jdbc/jakartaxreact/user",
        serverName = "localhost",
        portNumber = 3306,
        user = "root", // nom et
        password = "04092001", // mot de passe que vous avez donnés lors de la création de la base de données
        databaseName = "jakartaxreact",
        properties = {
            "useSSL=false",
            "allowPublicKeyRetrieval=true"
        }
)

@Path("admin")
@Stateless
public class AdminResource {
    
     @PersistenceContext(unitName = "jakartaPU")
     private EntityManager em;
     
    @GET
    @Consumes("application/x-www-form-urlencoded")
    @Path("list")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List findAll() {
       Query q = em.createNamedQuery("User.findAll", User.class);
        return q.getResultList();

        
    }
    @GET
    @Consumes("application/x-www-form-urlencoded")
    @Path("remove/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String find(@PathParam("id") Integer id) {
        Query q = em.createNamedQuery("User.findByIdUser");
        User u = (User) q.setParameter("idUser", id).getResultList().stream().findFirst().orElse(null);
        
        if (u==null) { 
             JsonObject value = Json.createObjectBuilder()
     .add("1", "user not found")
     .build();
             
             return value.toString();
        }
             else {
                em.remove(u);   
                JsonObject value = Json.createObjectBuilder()
     .add("2", "user deleted")
     .build();
                    
            return value.toString(); 
        }
}
}
