import React from 'react'
import Background from '../../Components/Template/Background/Background'
import Navbar1 from '../../Components/Template/Navbar1/Navbar1'
import { useCookies } from 'react-cookie'
import { Link } from 'react-router-dom'

const h1Style = {
  textAlign: "center",
  color: "white",
  zIndex: "2",
  paddingTop: "25px",
  textDecoration: "underline 2px white"

}

export default function Questionnary() {
  const [cookies] = useCookies(["logged"]);

  if (typeof cookies.logged != "undefined") {

    return (
      <>
        <Background />
        <Navbar1 />

        <h1 style={h1Style}> Questionnaire </h1>
      </>
    )
  } else {
    return (
      <>
        <Background />
        <Navbar1 />

        <div style={{ textAlign: "center", marginTop: "15%" }}>
          <h1 style={{ color: "red", fontSize: 100 }}>Non connecté !</h1>
          <h3 style={{ color: 'white' }}>Pour acceder à cette page, vous devez vous connecter !</h3>
          <p><Link to="/Connexion" style={{ color: 'red', textDecoration: "none" }}>Connexion...</Link></p>
        </div>
      </>
    )

  }
}
