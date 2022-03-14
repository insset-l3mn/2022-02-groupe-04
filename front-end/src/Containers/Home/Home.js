import React from 'react'
import Navbar1 from '../../Components/Navbar1/Navbar1'
import Background from '../../Components/Background/Background'

const h1Style = {
  textAlign: "center",
  color: "white",
  zIndex: "2",
  paddingTop: "25px",
  textDecoration: "underline 2px white"
  
  
}

export default function Home() {
  return (
      <>
            <Background />
            <Navbar1 />
        <h1 style={h1Style}> Votre formation en Audiovisuel !</h1>     
      </>
  )
}