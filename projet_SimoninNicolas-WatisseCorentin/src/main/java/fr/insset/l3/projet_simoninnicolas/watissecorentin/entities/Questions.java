/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nicolas
 */
@Entity
@Table(name = "questions")
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q"),
    @NamedQuery(name = "Questions.findByIdQuestions", query = "SELECT q FROM Questions q WHERE q.questionsPK.idQuestions = :idQuestions"),
    @NamedQuery(name = "Questions.findByForme", query = "SELECT q FROM Questions q WHERE q.forme = :forme"),
    @NamedQuery(name = "Questions.findByQuestionnaireidQuestionnaire", query = "SELECT q FROM Questions q WHERE q.questionsPK.questionnaireidQuestionnaire = :questionnaireidQuestionnaire")})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuestionsPK questionsPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "forme")
    private String forme;
    @JoinTable(name = "utilisateur_has_questions", joinColumns = {
        @JoinColumn(name = "Questions_idQuestions", referencedColumnName = "idQuestions")}, inverseJoinColumns = {
        @JoinColumn(name = "Utilisateur_idUtilisateur", referencedColumnName = "idUtilisateur")})
    @ManyToMany
    private Collection<Utilisateur> utilisateurCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionsidQuestions")
    private Collection<Formateur> formateurCollection;
    @JoinColumn(name = "Comp\u00e9tences_idComp\u00e9tences", referencedColumnName = "idComp\u00e9tences")
    @ManyToOne(optional = false)
    private Compétences compétencesidCompétences;
    @JoinColumn(name = "Questionnaire_idQuestionnaire", referencedColumnName = "idQuestionnaire", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Questionnaire questionnaire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questions")
    private Collection<Réponses> réponsesCollection;

    public Questions() {
    }

    public Questions(QuestionsPK questionsPK) {
        this.questionsPK = questionsPK;
    }

    public Questions(QuestionsPK questionsPK, String forme) {
        this.questionsPK = questionsPK;
        this.forme = forme;
    }

    public Questions(int idQuestions, int questionnaireidQuestionnaire) {
        this.questionsPK = new QuestionsPK(idQuestions, questionnaireidQuestionnaire);
    }

    public QuestionsPK getQuestionsPK() {
        return questionsPK;
    }

    public void setQuestionsPK(QuestionsPK questionsPK) {
        this.questionsPK = questionsPK;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    public Collection<Formateur> getFormateurCollection() {
        return formateurCollection;
    }

    public void setFormateurCollection(Collection<Formateur> formateurCollection) {
        this.formateurCollection = formateurCollection;
    }

    public Compétences getCompétencesidCompétences() {
        return compétencesidCompétences;
    }

    public void setCompétencesidCompétences(Compétences compétencesidCompétences) {
        this.compétencesidCompétences = compétencesidCompétences;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public Collection<Réponses> getRéponsesCollection() {
        return réponsesCollection;
    }

    public void setRéponsesCollection(Collection<Réponses> réponsesCollection) {
        this.réponsesCollection = réponsesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (questionsPK != null ? questionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.questionsPK == null && other.questionsPK != null) || (this.questionsPK != null && !this.questionsPK.equals(other.questionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.Questions[ questionsPK=" + questionsPK + " ]";
    }
    
}
