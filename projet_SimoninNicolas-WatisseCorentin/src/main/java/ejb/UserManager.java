/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ejb;

import entities.Utilisateur;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Persistence;


/**
 *
 * @author Nicolas
 */
@DataSourceDefinition (
    className="com.mysql.cj.jdbc.MysqlDataSource",
    name="java:app/jdbc/projet_jakarta",
    serverName="localhost",
    portNumber=3306,
    user="root",
    password="root",
    databaseName="projet_jakarta",
    properties = {
      "useSSL=false",
      "allowPublicKeyRetrieval=true"
    }
)


@Stateless
public class UserManager {

    /**
     * Creates a new instance of UserManager
     */
    @PersistenceContext
    private EntityManager em;

    public Utilisateur UserRequest(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager em1 = emf.createEntityManager();
        Query query = em1.createQuery("SELECT u FROM User u WHERE u.id_User=:id")
                .setParameter("id", id);
        Utilisateur utilisateur = null;

        if (!query.getResultList().isEmpty()) {
            utilisateur = (Utilisateur) query.getResultList().get(0);
        }
        return utilisateur;
    }
}
