import React, { useState, useEffect } from 'react';
import { Form, Button } from 'react-bootstrap'
import { createBrowserHistory } from "history";
import { useCookies } from 'react-cookie';


export default function NewQuestions() {

    
const [LogQuestion, setLogQuestion] = useState({});
let binData = null;


/* Fonction qui recup et formanet les données du FORM*/
const handleChange = (event) => {
   const name = event.target.name;
   const value = event.target.value;
   setLogQuestion(values => ({ ...values, [name]: value }));

 }

 const handleSubmit = (event) => {

    event.preventDefault();
    //console.log(LogQuestion);

    const formBody = Object.entries(LogQuestion).map(([key, value]) => encodeURIComponent(key) + '=' + encodeURIComponent(value)).join('&')
    fetch('/audiovisuel/resources/questions/add', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'
                },
                body: formBody
                })
            .then(response => response.text())
            .then(data => {
              binData = data;
              console.log(binData[2]); /* Montre la réponse de l'API */
              binData[2] === "1" ? Ok() : Error();
        });}
            
        const Ok = () => {
          alert('Nouvelle question ajoutée avec succé!');
        }
      
        const Error = () => {
          alert('Une erreur est survenu !')
        }
        



  return (
    <>
    <div className="container w-100" style={{ overflowY: "hidden", marginTop:"-100px" }}>
      <div className="body h-100 d-md-flex align-items-center justify-content-between">
        <div className=" box d-flex flex-column h-100 w-100" style={{ marginTop: "0px", overflowY: "hidden" }}>
          <div className="mt-5 w-100 h-100" style={{ overflowY: "hidden" }}>
            <p className="mb-1 h-1" style={{marginTop:'-10%',padding:'null'}}>Connecte toi.</p>
            <p className="text-muted mb-2">La formation est l'essence de tout succès.</p>
            <div className="d-flex flex-column ">
              <Form onSubmit={handleSubmit} style={{ zIndex: "9", display: "block" }}>
                <Form.Group className="mb-3" controlId="formBasicQuestion">
                  <Form.Label>Question</Form.Label>
                  <Form.Control type="Questions" name="Questions" value={LogQuestion.Questions || ''} placeholder="Entrez votre question" onChange={handleChange} required={true} autoComplete="off" />
                  <br></br>
                </Form.Group>

                <Form.Group className="mb-3" controlId="formBasicResponse">
                  <Form.Label>Vos propositions de réponse </Form.Label>
                  <Form.Control type="Reponse1" name="Reponse1" value={LogQuestion.Reponse1 || ''} placeholder="Proprosition n°1" onChange={handleChange} required={true} autoComplete="off" />
                  <Form.Control type="Reponse2" name="Reponse2" value={LogQuestion.Reponse2 || ''} placeholder="Proprosition n°2" onChange={handleChange} required={true} autoComplete="off" />
                  <Form.Control type="Reponse3" name="Reponse3" value={LogQuestion.Reponse3 || ''} placeholder="Proprosition n°3" onChange={handleChange} required={true} autoComplete="off" />
                  <Form.Control type="Reponse4" name="Reponse4" value={LogQuestion.Reponse4 || ''} placeholder="Proprosition n°4" onChange={handleChange} required={true} autoComplete="off" />
                </Form.Group>

                <Form.Group className="mb-3" controlId="formBasicTheme">
                <Form.Label>Thème de la question </Form.Label>
                <Form.Select type="Theme" name="Theme" value={LogQuestion.Theme || ''} onChange={handleChange} required={true} autoComplete="off" >
                        <option>Sujet de la question ...</option>
                        <option value="1-Animateur2D3D">Animateur(trice) de 2D et 3D</option>
                        <option value="2-AnimateurRadioTele">Animateur(trice) de de radio et de télévision</option>
                        <option value="3-AssistantDeRealisateur">Assistant(te) de réalisateur(trice)</option>
                        <option value="4-Cadreur">Cadreur(se)</option>
                        <option value="5-ChargeDeProduction">Chargé(e) de production</option>
                        <option value="6-ChefMonteur">Chef(fe) monteur(se)</option>
                        <option value="7-DirecteurDeLaPhotographie">Directeur(trice) de la photographie</option>
                        <option value="8-IngenieurSon">Ingenieu(e) du son</option>
                        <option value="9-JournalisteReporterDImages">Journaliste - Reporter d'images</option>
                        <option value="10-MachinisteConstructeurOUPlateau">Machiniste constructeur(trice) ou plateau</option>
                        <option value="11-MixeurSon">Mixeur(se) son</option>
                        <option value="12-Photographe">Photographe</option>
                        <option value="13-RegisseurGenerale">Regisseur(se) generale</option>
                        <option value="14-Scenariste">Scènariste</option>
                        <option value="15-Scripte">Scripte</option>
                </Form.Select>
                </Form.Group>


                <Button variant="primary" type="submit" style={{ zIndex: "99" }}>
                  Valider !
                </Button>
              </Form>
            </div>
          </div>

        </div> <span className="fas fa-times"></span>
      </div>
    </div>

  </>
  )
}
