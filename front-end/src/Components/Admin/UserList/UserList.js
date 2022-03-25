import React, { useEffect, useState } from 'react';


let binData = null;

const ButtonStyle = {

  display:'block',
  width:'100px',
  border:'none',
  padding:'4px',
  backgroundColor:'none',
}

export default function AdminList() {

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

function RemoveUser(Id){
  var dialog = window.confirm("Supprimer l'utilisateur : "+Id);
if (dialog) {
    alert('Utilisateur supprimé !')
    fetch('/audiovisuel/resources/admin/remove/'+Id)
    window.location.reload(false)
    
}
else {
    alert('Utilisateur non supprimé !')
}
}

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
          <tr>
          <td>
            {data && data.length>0 && data.map((item)=><button value={item.idUser} onClick={function(){RemoveUser(item.idUser)}} style={ButtonStyle}>{item.idUser}</button>)}
          </td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.mailUser}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.passwordUser}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.roleUser}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.formationUser}</p>)}</td>
          </tr>
        </tbody>

      </table>


    </div>
  </>

  );
};
