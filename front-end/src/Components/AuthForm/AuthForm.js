import './AuthForm.css'
import React, { useState, useEffect } from 'react';
import { Form, Button } from 'react-bootstrap'
import { Link } from 'react-router-dom'
import { createBrowserHistory } from "history";
import { useCookies } from 'react-cookie';



export default function AuthForm() {

  /* Pour récuperer depuis BDD*/
  const [greeting, setGreeting] = useState();
  /* Recupération des info du FORM */
  const [LogUser, setLogUser] = useState({});
  /* Création du Hook pour la redirection */
  const history = createBrowserHistory();
  /* Création du Hook pour la création d'un Cookie*/
  const [cookies, setCookie] = useCookies(["logged"]);

  let binData = null;

  /* Fonction qui recup et formanet les données du FORM*/
  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    setLogUser(values => ({ ...values, [name]: value }));

  }

  const handleSubmit = (event) => {

    event.preventDefault();
    console.log(LogUser);

      fetch('/audiovisuel/resources/user/login/'+LogUser.email+"/"+LogUser.password)
      .then(response => response.text())
      .then(data => {
        // console.log(data); /* Montre la réponse de l'API */
        binData = JSON.parse(data);
        console.log(binData[3]); /* Montre le role de l'user */
        binData[3] != undefined ? Redirect() : Error();
      });
     }

  /* Si connexion réussi -> redirection + cookie */
  const Redirect = () => {

    alert('Connexion réussi, appuyez sur "OK" pour être redirige !');
    setCookie("logged", "yes", { path: "/" });
    setCookie("username", LogUser.email);
    setCookie("role", binData[3])
    history.push("/")
    history.go()
  }

  const Error = () => {

    if (binData[1]) {
      alert ('Connexion refusé : Email non trouvé dans notre BDD !');
    } else if (binData[2]) {
      alert ("Connexion refusé : L'email et le mot de passe ne correspond pas !");
    } else {
      alert('Erreur interne, veuillez ressayez plus tard')
    }
}

  return (
    <>
      <div className="container" style={{ overflowY: "hidden" }}>
        <div className="body d-md-flex align-items-center justify-content-between">
          <div className="box-1 mt-md-0 mt-5"> <img src="Images/Lens.jpg" alt="" /> </div>
          <div className=" box-2 d-flex flex-column h-100" style={{ marginTop: "0px", overflowY: "hidden" }}>
            <div className="mt-5" style={{ overflowY: "hidden" }}>
              <p className="mb-1 h-1">Connecte toi.</p>
              <p className="text-muted mb-2">La formation est l'essence de tout succès.</p>
              <div className="d-flex flex-column ">
                <Form onSubmit={handleSubmit} style={{ zIndex: "9", display: "block" }}>
                  <Form.Group className="mb-3" controlId="formBasicEmail">
                    <Form.Label>E-Mail</Form.Label>
                    <Form.Control type="email" name="email" value={LogUser.email || ''} placeholder="Entrez votre adresse e-mail" onChange={handleChange} required={true} autoComplete="off" />
                    <br></br>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="formBasicPassword">
                    <Form.Label>Mot de passe</Form.Label>
                    <Form.Control type="password" name="password" value={LogUser.password || ''} placeholder="Entrez votre mot de passe" onChange={handleChange} required={true} autoComplete="off" />
                  </Form.Group>
                  <Button variant="primary" type="submit" style={{ zIndex: "99" }}>
                    Valider !
                  </Button>
                </Form>
              </div>
            </div>
            <div style={{ overflowY: "hidden", marginTop: "-10px" }}>
              <br></br>

              <Link to="/Inscription" style={{ textDecoration: 'none', overflowY: "hidden" }}>
                <p className="footer text-muted mb-0 mt-md-0 mt-4" style={{ fontSize: '12px' }}><span className="p-color me-1">L'inscription c'est par là !</span></p>
              </Link>

              <br></br>

              <p className="footer text-muted mb-0 mt-md-0 mt-4">En vous inscrivant, vous avez acceptez nos <span className="p-color me-1">termes et conditions</span> et notre<span className="p-color ms-1">politique de confidentialité</span> </p>

            </div>
          </div> <span className="fas fa-times"></span>
        </div>
      </div>

    </>
  )
}
