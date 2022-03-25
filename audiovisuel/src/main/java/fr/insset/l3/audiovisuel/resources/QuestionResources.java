/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.audiovisuel.resources;

import fr.insset.l3.audiovisuel.entities.Questions;
import java.util.List;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Nicolas
 */

@DataSourceDefinition(
        className = "com.mysql.cj.jdbc.MysqlDataSource",
        name = "java:app/jdbc/jakartaxreact/questions",
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

@Path("questions")
@Stateless
public class QuestionResources {
    @PersistenceContext(unitName = "jakartaPU")
    private EntityManager em;
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Questions find(@PathParam("id") Integer id) {
        Query q = em.createNamedQuery("User.findByIdQuestions");
        return (Questions) q.setParameter("idQuestions", id).getSingleResult();
    }
    
    @GET
    @Consumes("application/x-www-form-urlencoded")
    @Path("list")
    @Produces ({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List findAll() {
       Query q = em.createNamedQuery("Questions.findAll", Questions.class);
        return q.getResultList();
    }
    
    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Path("add")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String find(@FormParam("Questions") String Questions, @FormParam("Reponse1") String Reponse1, @FormParam("Reponse2") String Reponse2, @FormParam("Reponse3") String Reponse3, @FormParam("Reponse4") String Reponse4, @FormParam("Theme") String Theme){
            Query q = em.createNamedQuery("Questions.findByQuestions");
        
            Questions questions;
            questions = (Questions) q.setParameter("questions", Questions).getResultList().stream().findFirst().orElse(null);

            em.persist(new Questions(1,Questions,Reponse1,Reponse2,Reponse3,Reponse4,Theme));
            
            JsonObject value = Json.createObjectBuilder()
            .add("1", "question successfully created")
            .build();
            
            return value.toString();

    }
    
    
    @GET
    @Consumes("application/x-www-form-urlencoded")
    @Path("remove/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String remove(@PathParam("id") Integer id) {
        Query q = em.createNamedQuery("Questions.findByIdQuestions");
        Questions u = (Questions) q.setParameter("idQuestions", id).getResultList().stream().findFirst().orElse(null);
        
        if (u==null) { 
             JsonObject value = Json.createObjectBuilder()
     .add("1", "question not found")
     .build();
             
             return value.toString();
        }
             else {
                em.remove(u);   
                JsonObject value = Json.createObjectBuilder()
     .add("2", "question deleted")
     .build();
                    
            return value.toString(); 
        }
    }
    
}