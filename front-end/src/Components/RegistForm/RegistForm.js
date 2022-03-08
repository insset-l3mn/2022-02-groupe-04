import React from 'react'
import './RegistForm.css'
import { Form, Button } from 'react-bootstrap'

export default function RegistForm() {
  return (
    <>

    <div class="container">
    <div class="body d-md-flex align-items-center justify-content-between">
        <div class="box-1 mt-md-0 mt-5"> <img src="Images/Lens.jpg" class="" alt=""/> </div>
        <div class=" box-2 d-flex flex-column h-100">
            <div class="mt-5">
                <p class="mb-1 h-1">Créez votre compte.</p>
                <p class="text-muted mb-2">La formation est l'essence de tout succès.</p>
                <div class="d-flex flex-column ">
                  <Form>

                  <Form.Group className="mb-3" controlId="formBasicName">
                    <Form.Label>Nom</Form.Label>
                    <Form.Control type="mdp" placeholder="Entrez votre nom" />
                  </Form.Group>


                  <Form.Group className="mb-3" controlId="formBasicEmail">
                    <Form.Label>E-Mail</Form.Label>
                    <Form.Control type="email" placeholder="Entrez votre adresse e-mail" />
                    <Form.Text className="text-muted" style={{fontSize:"10px"}}>
                      Nous ne partagerons jamais votre e-mail a autrui.
                    </Form.Text>
                  </Form.Group>

                  <Form.Group className="mb-3" controlId="formBasicPassword">
                    <Form.Label>Mot de passe</Form.Label>
                    <Form.Control type="mdp" placeholder="Entrez votre mot de passe" />
                  </Form.Group>


                  <Button variant="primary" type="submit">
                    Valider !
                  </Button>
                </Form>
                </div>
            </div>
            <div class="mt-auto">

            <br></br>

                <p class="footer text-muted mb-0 mt-md-0 mt-4">En vous inscrivant, vous acceptez nos <span class="p-color me-1">termes et conditions</span> et notre<span class="p-color ms-1">politique de confidentialité</span> </p>


            </div>
        </div> <span class="fas fa-times"></span>
    </div>
</div>
    </>
  )
}
