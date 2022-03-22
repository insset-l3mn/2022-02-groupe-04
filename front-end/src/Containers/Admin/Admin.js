import React, { useState, useEffect } from 'react';
import Navbar1 from '../../Components/Navbar1/Navbar1'
import Background from '../../Components/Background/Background'
import AdminList from '../../Components/AdminList/AdminList';

const h1Style = {
    textAlign: "center",
    color: "white",
    zIndex: "2",
    paddingTop: "25px",
    textDecoration: "underline 2px white"
  }

export default function Admin() {
    
    
    
      return (
          <>

                <Background />
                <Navbar1 />

                <h1 style={h1Style}> Votre panel ADMIN </h1>     


                <AdminList />
          </>
      )
    }
    