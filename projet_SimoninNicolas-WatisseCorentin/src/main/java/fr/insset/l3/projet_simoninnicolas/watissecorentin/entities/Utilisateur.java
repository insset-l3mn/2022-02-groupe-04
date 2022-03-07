/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "utilisateur")
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByIdUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.utilisateurPK.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByNom", query = "SELECT u FROM Utilisateur u WHERE u.nom = :nom"),
    @NamedQuery(name = "Utilisateur.findByPrenom", query = "SELECT u FROM Utilisateur u WHERE u.prenom = :prenom"),
    @NamedQuery(name = "Utilisateur.findByFormation", query = "SELECT u FROM Utilisateur u WHERE u.formation = :formation"),
    @NamedQuery(name = "Utilisateur.findByUniversit\u00e9", query = "SELECT u FROM Utilisateur u WHERE u.universit\u00e9 = :universit\u00e9"),
    @NamedQuery(name = "Utilisateur.findByMail", query = "SELECT u FROM Utilisateur u WHERE u.mail = :mail"),
    @NamedQuery(name = "Utilisateur.findByParcoursidParcours", query = "SELECT u FROM Utilisateur u WHERE u.utilisateurPK.parcoursidParcours = :parcoursidParcours")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UtilisateurPK utilisateurPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "formation")
    private String formation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Universit\u00e9")
    private String université;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "mail")
    private String mail;
    @ManyToMany(mappedBy = "utilisateurCollection")
    private Collection<Réponses> réponsesCollection;
    @ManyToMany(mappedBy = "utilisateurCollection")
    private Collection<Questions> questionsCollection;
    @JoinColumn(name = "Graphe_idGraphe", referencedColumnName = "idGraphe")
    @ManyToOne(optional = false)
    private Graphe grapheidGraphe;
    @JoinColumn(name = "Parcours_idParcours", referencedColumnName = "idParcours", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Parcours parcours;

    public Utilisateur() {
    }

    public Utilisateur(UtilisateurPK utilisateurPK) {
        this.utilisateurPK = utilisateurPK;
    }

    public Utilisateur(UtilisateurPK utilisateurPK, String nom, String prenom, String formation, String université, String mail) {
        this.utilisateurPK = utilisateurPK;
        this.nom = nom;
        this.prenom = prenom;
        this.formation = formation;
        this.université = université;
        this.mail = mail;
    }

    public Utilisateur(int idUtilisateur, int parcoursidParcours) {
        this.utilisateurPK = new UtilisateurPK(idUtilisateur, parcoursidParcours);
    }

    public UtilisateurPK getUtilisateurPK() {
        return utilisateurPK;
    }

    public void setUtilisateurPK(UtilisateurPK utilisateurPK) {
        this.utilisateurPK = utilisateurPK;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getUniversité() {
        return université;
    }

    public void setUniversité(String université) {
        this.université = université;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Collection<Réponses> getRéponsesCollection() {
        return réponsesCollection;
    }

    public void setRéponsesCollection(Collection<Réponses> réponsesCollection) {
        this.réponsesCollection = réponsesCollection;
    }

    public Collection<Questions> getQuestionsCollection() {
        return questionsCollection;
    }

    public void setQuestionsCollection(Collection<Questions> questionsCollection) {
        this.questionsCollection = questionsCollection;
    }

    public Graphe getGrapheidGraphe() {
        return grapheidGraphe;
    }

    public void setGrapheidGraphe(Graphe grapheidGraphe) {
        this.grapheidGraphe = grapheidGraphe;
    }

    public Parcours getParcours() {
        return parcours;
    }

    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (utilisateurPK != null ? utilisateurPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.utilisateurPK == null && other.utilisateurPK != null) || (this.utilisateurPK != null && !this.utilisateurPK.equals(other.utilisateurPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Utilisateur[ utilisateurPK=" + utilisateurPK + " ]";
    }
    
}
