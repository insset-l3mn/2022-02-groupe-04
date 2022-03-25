package fr.insset.l3.audiovisuel.resources;

import fr.insset.l3.audiovisuel.entities.User;
import java.util.List;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
import org.json.JSONObject;


/**
 *
 * @author 
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
@Path("user")
@Stateless
public class UserResource {
    
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
    public String find(@PathParam("mail") String mail, @PathParam("password") String password) {
        Query q = em.createNamedQuery("User.findByMailUser");

        User user;
        user = (User) q.setParameter("mailUser", mail).getResultList().stream().findFirst().orElse(null);

        
        if (user==null) { // cas mail non trouvé
             JsonObject value = Json.createObjectBuilder()
     .add("1", "mail not found")
     .build();
                    
            return value.toString();
        } else if(!user.getPasswordUser().equals(password)) {
            JsonObject value = Json.createObjectBuilder()
     .add("2", "mail or password incorrect")
     .build();
                    
            return value.toString(); 
        } else {
            JsonObject value = Json.createObjectBuilder()
     .add("3", user.getRoleUser())
     .build();
                    
            return value.toString(); 
        }
        // mail trouvé
        // 1. cas password correct
        // 2. cas password incorrect
        //if (!Query.getResultList.isEmpty()){
        //    User = (User) query.getResultList().get(0);
        //}
        //return (User) q.setParameter("mail", mail).getSingleResult();
    }
       
    
    @GET
    @Consumes("application/x-www-form-urlencoded")
    @Path("register/{mail}/{password}/{role}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String find(@PathParam("mail") String mail, @PathParam("password") String password, @PathParam("role") String role ){
           Query q = em.createNamedQuery("User.findByMailUser");
        
            User user;
            user = (User) q.setParameter("mailUser", mail).getResultList().stream().findFirst().orElse(null);
           
           if (user==null) { 
             JsonObject value = Json.createObjectBuilder()
     .add("1", "account not in BDD")
     .build();
            em.persist(new User(null,mail,password,role));

            return value.toString();
        } else {
            JsonObject value = Json.createObjectBuilder()
     .add("2", "account already exist !")
     .build();
           
           return value.toString();
    }
    
    }
    
}
