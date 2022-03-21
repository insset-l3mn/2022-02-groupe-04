import React from 'react'
import { Navbar } from 'react-bootstrap'
import { Container, Nav } from 'react-bootstrap'
import { Link } from 'react-router-dom'


export default function Navbar1() {
  return (
    <>


      <Navbar bg="dark" variant="dark">
        <Container>

          <Link to="/" style={{ textDecoration: 'none', overflowY: "hidden", overflowX: "hidden" }}>
            <Navbar.Brand style={{ overflowY: "hidden", overflowX: "hidden" }}>Jakarta EE X ReactJS - Projet</Navbar.Brand>
          </Link>
          <Navbar.Brand> | </Navbar.Brand>

          <Nav className="me-auto">

            <Link className="nav-link" to="/Formation" style={{ textDecoration: 'none' }}> Votre formation ...  </Link>

            <Link className="nav-link" to="/Questionnaire" style={{ textDecoration: 'none' }}> Votre questionnaire ...  </Link>

          </Nav>
          <Navbar.Collapse className="justify-content-end">

            <Link className="nav-link" to="/Connexion" style={{
              textDecoration: 'none',
              color: 'rgba(255,255,255,.55)'
            }}>Connexion</Link>

          </Navbar.Collapse>
        </Container>
      </Navbar>

    </>
  )
}