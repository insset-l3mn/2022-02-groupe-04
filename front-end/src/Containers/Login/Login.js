import React from 'react'
import Background from '../../Components/Template/Background/Background'
import Navbar1 from '../../Components/Template/Navbar1/Navbar1'
import AuthForm from '../../Components/User/AuthForm/AuthForm'
import { useCookies } from 'react-cookie'

const ButtonStyle = {
    border: "none",
    background: "none",
    color: "red"
}

export default function Login() {


  const DelCookie = (event) => {
    removeCookie('logged');
    removeCookie('username');
    removeCookie('role');
  }

  const [cookies, setCookie, removeCookie] = useCookies(["logged"]);
  if (typeof cookies.logged == "undefined") {
    return (
      <>
        <Background />
        <Navbar1 />

        <AuthForm />


      </>
    )
  } else {
    return (
      <>
        <Background />
        <Navbar1 />

        <div style={{ textAlign: "center", marginTop: "15%" }}>
          <h1 style={{ color: "red", fontSize: 100 }}>Déjà connecté !</h1>
          <h3 style={{ color: 'white' }}>Pourquoi vouloir vous connecter alors que vous l'êtes déjà ? !</h3>
          <button onClick={DelCookie} style={ButtonStyle}> Déconnexion !</button>
        </div>
      </>
    )

  }
}

