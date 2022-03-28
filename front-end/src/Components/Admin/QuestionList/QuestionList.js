import React, { useEffect, useState } from 'react';

const ButtonStyle = {

    display:'block',
    width:'100px',
    border:'none',
    padding:'7px',
    backgroundColor:'none',
  }

export default function QuestionList() {
    const [data, setData] = useState([]);
const getData=()=>{
  fetch('/audiovisuel/resources/questions/list')
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
  var dialog = window.confirm("Supprimer la question : "+Id);
if (dialog) {
    alert('Question supprimé !')
    fetch('/audiovisuel/resources/questions/remove/'+Id)
    window.location.reload(false)
    
}
else {
    alert('Question non supprimé !')
}
}

  return (
<>
    <div style={{ padding: "20px", backgroundColor:"white", margin:"20px",borderRadius:"25px" }}>
      <table className='table table-striped'>
        <thead>
          <tr>
            <th> #ID </th>
            <th> Question </th>
            <th> Reponse 1 </th>
            <th> Reponse 2 </th>
            <th> Reponse 3 </th>
            <th> Reponse 4 </th>
            <th> Theme </th>
          </tr>
        </thead>
        <tbody>
          <tr>
          <td>
            {data && data.length>0 && data.map((item)=><button value={item.idQuestions} onClick={function(){RemoveUser(item.idQuestions)}} style={ButtonStyle}>{item.idQuestions}</button>)}
          </td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.questions}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.reponse1}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.reponse2}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.reponse3}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.reponse4}</p>)}</td>
          <td>{data && data.length>0 && data.map((item)=><p>{item.theme}</p>)}</td>
          </tr>
        </tbody>

      </table>


    </div>
  </>
  )
}
