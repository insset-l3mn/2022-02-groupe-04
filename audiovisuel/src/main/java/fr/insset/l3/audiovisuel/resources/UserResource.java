package fr.insset.l3.audiovisuel.resources;

import fr.insset.l3.audiovisuel.entities.User;
import java.util.List;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import jdk.jfr.ContentType;

/**
 *
 * @author 
 */
@DataSourceDefinition(
        className = "com.mysql.cj.jdbc.MysqlDataSource",
        name = "java:app/jdbc/banque",
        serverName = "localhost",
        portNumber = 3306,
        user = "root", // nom et
        password = "29092001", // mot de passe que vous avez donnés lors de la création de la base de données
        databaseName = "banque",
        properties = {
            "useSSL=false",
            "allowPublicKeyRetrieval=true"
        }
)
@Path("user")
@Stateless
public class UserResource {
    
    @PersistenceContext(unitName = "banquePU")
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
    public User find(@PathParam("id") Integer id) {
        Query q = em.createNamedQuery("User.findByIdUser");
        return (User) q.setParameter("idUser", id).getSingleResult();
        //return new User(1, "toto", "toto");
        //em.persist(new User(1, "toto", "toto"));
        //Query q = em.createNamedQuery("User.findAll", User.class);
        //return q.getResultList();
    }
    
    @GET
    @Consumes("application/x-www-form-urlencoded")
    @Path("login/{mail}/{password}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public User find(@PathParam("mail") String mail, @PathParam("password") String password) {
        Query q = em.createNamedQuery("User.findByMail");
       
        
        
        return (User) q.setParameter("mail", mail).getSingleResult();
    }
    
}