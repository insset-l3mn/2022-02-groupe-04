import React from 'react'
import { Navbar } from 'react-bootstrap'
import { Container, Nav } from 'react-bootstrap'
import { Link } from 'react-router-dom'

const NavStyle = 
{
  textDecoration:'none',
  color:'rgba(255,255,255,.55)'
}

export default function Navbar1() {
  return (
<>


<Navbar bg="dark" variant="dark">
  <Container>

      <Link to="/" style={{  textDecoration:'none' }}>
      <Navbar.Brand>Jakarta EE X ReactJS - Projet</Navbar.Brand>
      </Link>
     
     
      <Navbar.Brand> | </Navbar.Brand>

      <Nav className="me-auto">

      <Link to="/Formation" style={{  textDecoration:'none' }}>
        <Nav.Link href="/Formation">Votre formation ...</Nav.Link>
      </Link>

      <Link to="/Questionnaire" style={{  textDecoration:'none' }}>
        <Nav.Link href="/Questionnaire">Votre questionnaire ...</Nav.Link>
      </Link>

      </Nav>
      <Navbar.Collapse className="justify-content-end">

        <Link to="/Connexion" style={{  textDecoration:'none' }}>
         <Nav.Link href="/Connexion" style={NavStyle}>Connexion</Nav.Link>
        </Link>

      </Navbar.Collapse>
  </Container>
</Navbar>

</>
  )
}