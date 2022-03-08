import React from 'react'
import Background from '../../Components/Background/Background'
import Navbar1 from '../../Components/Navbar1/Navbar1'


const h1Style = {
  textAlign: "center",
  color: "white",
  zIndex: "2",
  paddingTop: "25px",
  textDecoration: "underline 2px white"
  
  
}

export default function Formation() {
  return (
      <>
        <Background />
        <Navbar1 />

        <h1 style={h1Style}> Formation </h1>     
      </>
  )
}
