import './App.css';
import './Components/Template/Background/Background.scss'
import { Routes, Route } from "react-router-dom"

import Home from './Containers/Home/Home'
import Formation from './Containers/Formation/Formation';
import Login from './Containers/Login/Login';
import NotFound from './Containers/NotFound/NotFound';
import Inscription from './Containers/Inscription/Inscription';
import Admin from './Containers/Admin/Admin';
import Questions from './Containers/Questions/Questions';
import QuestionListe from './Containers/QuestionListe/QuestionListe';
import Questionnary from './Containers/Questionnary/Questionnary';


function App() {
  return (
    <>
      <Routes>
        <Route path="/"                    element={ <Home/>} />
        <Route path="/Formation"           element={ <Formation/> } />
        <Route path="/Questionnaire"       element={ <Questionnary/> } />
        <Route path="/Connexion"           element={ <Login/>} />
        <Route path="/Inscription"         element={ <Inscription /> } /> 
        <Route path="/PanelAdmin"          element={ <Admin /> } />
        <Route path="/QuestionsAdmin"      element={ <Questions />} />
        <Route path="/ListeQuestionsAdmin" element={ <QuestionListe />} />
        <Route path='*'                    element={ <NotFound /> } />
      </Routes>
    </>

  );
}



export default App;
