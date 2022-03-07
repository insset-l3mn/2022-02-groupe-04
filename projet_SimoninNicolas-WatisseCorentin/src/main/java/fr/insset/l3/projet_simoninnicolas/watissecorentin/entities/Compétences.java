/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "comp\u00e9tences")
@NamedQueries({
    @NamedQuery(name = "Comp\u00e9tences.findAll", query = "SELECT c FROM Comp\u00e9tences c"),
    @NamedQuery(name = "Comp\u00e9tences.findByIdComp\u00e9tences", query = "SELECT c FROM Comp\u00e9tences c WHERE c.comp\u00e9tencesPK.idComp\u00e9tences = :idComp\u00e9tences"),
    @NamedQuery(name = "Comp\u00e9tences.findByGrapheidGraphe", query = "SELECT c FROM Comp\u00e9tences c WHERE c.comp\u00e9tencesPK.grapheidGraphe = :grapheidGraphe")})
public class Compétences implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompétencesPK compétencesPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comp\u00e9tencesidComp\u00e9tences")
    private Collection<Questions> questionsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comp\u00e9tences")
    private Collection<Formation> formationCollection;
    @JoinColumn(name = "Graphe_idGraphe", referencedColumnName = "idGraphe", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Graphe graphe;

    public Compétences() {
    }

    public Compétences(CompétencesPK compétencesPK) {
        this.compétencesPK = compétencesPK;
    }

    public Compétences(int idCompétences, int grapheidGraphe) {
        this.compétencesPK = new CompétencesPK(idCompétences, grapheidGraphe);
    }

    public CompétencesPK getCompétencesPK() {
        return compétencesPK;
    }

    public void setCompétencesPK(CompétencesPK compétencesPK) {
        this.compétencesPK = compétencesPK;
    }

    public Collection<Questions> getQuestionsCollection() {
        return questionsCollection;
    }

    public void setQuestionsCollection(Collection<Questions> questionsCollection) {
        this.questionsCollection = questionsCollection;
    }

    public Collection<Formation> getFormationCollection() {
        return formationCollection;
    }

    public void setFormationCollection(Collection<Formation> formationCollection) {
        this.formationCollection = formationCollection;
    }

    public Graphe getGraphe() {
        return graphe;
    }

    public void setGraphe(Graphe graphe) {
        this.graphe = graphe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compétencesPK != null ? compétencesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compétences)) {
            return false;
        }
        Compétences other = (Compétences) object;
        if ((this.compétencesPK == null && other.compétencesPK != null) || (this.compétencesPK != null && !this.compétencesPK.equals(other.compétencesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Comp\u00e9tences[ comp\u00e9tencesPK=" + compétencesPK + " ]";
    }
    
}
