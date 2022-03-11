import './AuthForm.css'
import React, {useState} from 'react'
import { Form, Button } from 'react-bootstrap'
import { Link } from 'react-router-dom'
import { createBrowserHistory } from "history";



export default function AuthForm() {

  /* Recupération des info du FORM */
  const [LogUser, setLogUser] = useState({});
  const history = createBrowserHistory();

  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    setLogUser(values => ({...values, [name]: value}));

  }


  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(LogUser);
    setTimeout(function(){
      history.push("/")
      history.go() 
   }, 3000);

  }

  return (

<>
<div className="container">
    <div className="body d-md-flex align-items-center justify-content-between">
        <div className="box-1 mt-md-0 mt-5"> <img src="Images/Lens.jpg"/> </div>
        <div className=" box-2 d-flex flex-column h-100" style={{marginTop:"0px"}}>
            <div className="mt-5">
                <p className="mb-1 h-1">Connecte toi.</p>
                <p className="text-muted mb-2">La formation est l'essence de tout succès.</p>
                <div className="d-flex flex-column ">
                  <Form onSubmit={handleSubmit}>
                  <Form.Group className="mb-3" controlId="formBasicEmail">
                    <Form.Label>E-Mail</Form.Label>
                    <Form.Control type="email" name="email" value={LogUser.email || ''} placeholder="Entrez votre adresse e-mail" onChange={handleChange} required={true} autoComplete="off"/>
                  <br></br>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="formBasicPassword">
                    <Form.Label>Mot de passe</Form.Label>
                    <Form.Control type="password" name="password" value={LogUser.password || ''} placeholder="Entrez votre mot de passe" onChange={handleChange} required={true} autoComplete="off" />
                  </Form.Group>
                  <Button variant="primary" type="submit">
                    Valider !
                  </Button>
                </Form>
                </div>
            </div>
            <div className="mt-auto">

              <br></br>

            <Link to="/Inscription" style={{  textDecoration:'none' }}>
            <p className="footer text-muted mb-0 mt-md-0 mt-4" style={{ fontSize:'12px' }}><span className="p-color me-1">L'inscription c'est par là !</span></p>
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
