import React, { useState, useEffect } from 'react';
import Navbar1 from '../../Components/Template/Navbar1/Navbar1'
import Background from '../../Components/Template/Background/Background'

const h1Style = {
  textAlign: "center",
  color: "white",
  zIndex: "2",
  paddingTop: "25px",
  textDecoration: "underline 2px white"
}

export default function Home() {

const [greeting, setGreeting] = useState();


   fetch('/audiovisuel/resources/user')
     .then(response => response.text())
     .then(text => setGreeting(text));



  return (
      <>
            <Background />
            <Navbar1 />
        <h1 style={h1Style}> Votre formation en Audiovisuel !</h1>     
        <p style={{color:"white"}}>{greeting}</p>
      </>
  )
}
