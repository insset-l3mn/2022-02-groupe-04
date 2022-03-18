import React, { useState } from 'react';
import './RegistForm.css';
import { Form, Button } from 'react-bootstrap';
import ReactDOM from "react-dom";
import { createBrowserHistory } from "history";



export default function RegistForm() {

  /* Recupération des info du FORM */
  const [NewUser, setNewUser] = useState({});
  /* Création du Hook pour la redirection */
  const history = createBrowserHistory();

  /* Fonctions pour recup les infos du form*/
  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    setNewUser(values => ({ ...values, [name]: value }));

  }

  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(NewUser);
    setTimeout(function () {
      history.push("/Connexion")
      history.go()
    }, 3000);

  }

  return (
    <>

      <div className="container">
        <div className="body d-md-flex align-items-center justify-content-between">
          <div className="box-1 mt-md-0 mt-5"> <img src="Images/Lens.jpg" alt="" /> </div>
          <div className=" box-2 d-flex flex-column h-150" style={{ marginTop: "0px" }}>
            <div className="mt-5">
              <p className="mb-1 h-1">Créez votre compte.</p>
              <p className="text-muted mb-2">La formation est l'essence de tout succès.</p>
              <div className="d-flex flex-column ">
                <Form onSubmit={handleSubmit} >

                  <Form.Group className="mb-3" controlId="formBasicName">
                    <Form.Label>Nom</Form.Label>
                    <Form.Control type="name" name="name" value={NewUser.name || ''} onChange={handleChange} placeholder="Entrez votre nom" required={true} autoComplete="off" />
                  </Form.Group>


                  <Form.Group className="mb-3" controlId="formBasicEmail">
                    <Form.Label>E-Mail</Form.Label>
                    <Form.Control type="email" name="email" value={NewUser.email || ''} onChange={handleChange} placeholder="Entrez votre adresse e-mail" required={true} autoComplete="off" />
                    <Form.Text className="text-muted" style={{ fontSize: "10px" }}>
                      Nous ne partagerons jamais votre e-mail a autrui.
                    </Form.Text>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="formBasicPassword">
                    <Form.Label>Mot de passe</Form.Label>
                    <Form.Control type="password" name="password" value={NewUser.password || ''} onChange={handleChange} placeholder="Entrez votre mot de passe" required={true} autoComplete="off" />
                  </Form.Group>


                  <Button variant="primary" type="submit">
                    Valider !
                  </Button>
                </Form>
              </div>
            </div>
            <div style={{ marginTop: "-20px" }}>

              <br></br>

              <p className="footer text-muted mb-0 mt-md-0 mt-4">En vous inscrivant, vous acceptez nos <span className="p-color me-1">termes et conditions</span> et notre<span className="p-color ms-1">politique de confidentialité</span> </p>


            </div>
          </div> <span className="fas fa-times"></span>
        </div>
      </div>
    </>
  )
}

ReactDOM.render(<RegistForm />, document.getElementById('root'));