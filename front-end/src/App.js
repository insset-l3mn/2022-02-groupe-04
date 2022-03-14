import './App.css';
import './Components/Background/Background.scss'
import { Routes, Route} from "react-router-dom"

import Home from './Containers/Home/Home'
import Quesionnaire from './Containers/Questionnaire/Questionnaire';
import Formation from './Containers/Formation/Formation';
import Login from './Containers/Login/Login';
import NotFound from './Containers/NotFound/NotFound';
import Inscription from './Containers/Inscription/Inscription';




function App() {
  return (
    <>
      <Routes>
        <Route path="/"              element={ <Home/>} />
        <Route path="/Formation"     element={ <Formation/> } />
        <Route path="/Questionnaire" element={ <Quesionnaire/> } />
        <Route path="/Connexion"     element={ <Login/>} />
        <Route path="/Inscription"   element={ <Inscription /> } /> 
        <Route path='*'              element={ <NotFound /> } />
      </Routes>
    </>

  );
}



export default App;
