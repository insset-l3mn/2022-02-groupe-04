import React from 'react'
import { Link } from "react-router-dom"



export default function Formation() {
  return (
      <>
      <div style={{textAlign:"center",marginTop:"15%"}}>
      <h1 style={{color: "red",fontSize: 100 }}>404</h1>
      <h3 style={{color: 'white'}}>Page Not Found !</h3>
      <p>
        <Link to="/" style={{color:'red',textDecoration:"none"}}>Retour acceuil</Link>
      </p>

      </div>
      </>
  )
}
