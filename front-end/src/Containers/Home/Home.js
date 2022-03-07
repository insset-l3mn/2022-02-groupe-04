import React from 'react'

export default function Home(props) {
    console.log(props)
  return (
      <>
        <h1> Home {props.valeur} </h1>     
            {props.children}
      </>
  )
}
