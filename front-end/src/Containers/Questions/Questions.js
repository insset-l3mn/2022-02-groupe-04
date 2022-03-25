import React from 'react'
import Background from '../../Components/Background/Background'
import Navbar1 from '../../Components/Navbar1/Navbar1'
import NewQuestions from '../../Components/NewQuestions/NewQuestions'
import { useCookies } from 'react-cookie'
import { Link } from 'react-router-dom'

const h1Style = {
    textAlign: "center",
    color: "white",
    zIndex: "2",
    paddingTop: "25px",
    textDecoration: "underline 2px white"
  
  }

export default function Questions() {
    const [cookies] = useCookies(['role']);

    if (cookies.role === "formateur") {
        return (
            <>
              <Background />
              <Navbar1 />
      
              <NewQuestions />
            </>
          )
        } else {
          return (
            <>
              <Background />
              <Navbar1 />
      
              <div style={{ textAlign: "center", marginTop: "15%" }}>
                <h1 style={{ color: "red", fontSize: 100 }}>Accès interdit !</h1>
                <h3 style={{ color: 'white' }}>Pour acceder à cette page, vous devez vous connecter avec un compte formateur!</h3>
                <p><Link to="/Connexion" style={{ color: 'red', textDecoration: "none" }}>Connexion...</Link></p>
              </div>
            </>
          )
      
        }
      }
      