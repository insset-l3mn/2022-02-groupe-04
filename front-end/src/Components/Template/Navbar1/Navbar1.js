import React from 'react'
import { Navbar, NavDropdown } from 'react-bootstrap'
import { Container, Nav } from 'react-bootstrap'
import { useCookies } from 'react-cookie'
import { Link } from 'react-router-dom'


export default function Navbar1() {
  const [cookies] = useCookies(["role"]);

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

            {/* //<Link className="nav-link" to="/PanelAdmin" style={{ textDecoration : 'none'}}> Panel ADMIN ... </Link>+ */}

            <NavDropdown title="Panel ADMIN ..." id="basic-nav-dropdown">
            <Link className="dropdown-item" to="/PanelAdmin" style={{ textDecoration: 'none' }}> Liste des users ...  </Link>
            <Link className="dropdown-item" to="/QuestionsAdmin" style={{ textDecoration: 'none' }}> Créer une nouvelle question ...  </Link>
            <Link className="dropdown-item" to="/ListeQuestionsAdmin" style={{ textDecoration: 'none' }}> Liste des questions ...  </Link>
              {/* <NavDropdown.Item href="/PanelAdmin">Liste des users ...</NavDropdown.Item>
              <NavDropdown.Item href="/QuestionsAdmin">Créer une nouvelle question ...</NavDropdown.Item>
              <NavDropdown.Item href="/ListeQuestionsAdmin">Liste des questions ... </NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">Separated link</NavDropdown.Item> */}
            </NavDropdown>

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