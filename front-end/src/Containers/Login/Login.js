import React from 'react'
import Background from '../../Components/Background/Background'
import Navbar1 from '../../Components/Navbar1/Navbar1'
import AuthForm from '../../Components/AuthForm/AuthForm'


const h1Style = {
  textAlign: "center",
  color: "white",
  zIndex: "2",
  paddingTop: "25px",
  textDecoration: "underline 2px white"
  
  
}

export default function Login() {
  return (
      <>
        <Background />
        <Navbar1 />

        <AuthForm />
        
          
      </>
  )
}
