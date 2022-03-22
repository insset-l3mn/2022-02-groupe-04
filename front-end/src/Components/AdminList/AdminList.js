import React, { useEffect, useState } from 'react';


let binData = null;

export default function AdminList() {

// useEffect(()=>{

//   fetch('/audiovisuel/resources/admin/list')
//   .then(response => response.text())
//   .then(data => {
//     // console.log(data); /* Montre la réponse de l'API */
//     binData = JSON.parse(data);
//     console.log(binData[0].idUser)
//   });    
//   }, [])

const [data, setData] = useState([]);
const getData=()=>{
  fetch('/audiovisuel/resources/admin/list')
  .then(function(response){
    console.log(response)
    return response.json();
  })
  .then(function(myJson) {
    console.log(myJson);
    setData(myJson)
  });
}
  useEffect(()=>{
    getData()
  },[])

  return (

  <>
    <div style={{ padding: "20px", backgroundColor:"white", margin:"20px",borderRadius:"25px" }}>
      <table className='table table-striped'>
        <thead>
          <tr>
            <th> #ID </th>
            <th> Mail </th>
            <th> Password </th>
            <th> Role </th>
            <th> Formation </th>
          </tr>
        </thead>
        <tbody>
          <td>{data && data.length>0 && data.map((item)=><p>{item.idUser}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.mailUser}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.passwordUser}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.roleUser}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.formationUser}</p>)}</td>
        </tbody>
      </table>


    </div>
  </>

  );
};
