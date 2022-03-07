/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insset.l3.projet_simoninnicolas.watissecorentin.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Nicolas
 */
@Embeddable
public class QuestionsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idQuestions")
    private int idQuestions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Questionnaire_idQuestionnaire")
    private int questionnaireidQuestionnaire;

    public QuestionsPK() {
    }

    public QuestionsPK(int idQuestions, int questionnaireidQuestionnaire) {
        this.idQuestions = idQuestions;
        this.questionnaireidQuestionnaire = questionnaireidQuestionnaire;
    }

    public int getIdQuestions() {
        return idQuestions;
    }

    public void setIdQuestions(int idQuestions) {
        this.idQuestions = idQuestions;
    }

    public int getQuestionnaireidQuestionnaire() {
        return questionnaireidQuestionnaire;
    }

    public void setQuestionnaireidQuestionnaire(int questionnaireidQuestionnaire) {
        this.questionnaireidQuestionnaire = questionnaireidQuestionnaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idQuestions;
        hash += (int) questionnaireidQuestionnaire;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuestionsPK)) {
            return false;
        }
        QuestionsPK other = (QuestionsPK) object;
        if (this.idQuestions != other.idQuestions) {
            return false;
        }
        if (this.questionnaireidQuestionnaire != other.questionnaireidQuestionnaire) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.insset.l3.projet_simoninnicolas.watissecorentin.QuestionsPK[ idQuestions=" + idQuestions + ", questionnaireidQuestionnaire=" + questionnaireidQuestionnaire + " ]";
    }
    
}
