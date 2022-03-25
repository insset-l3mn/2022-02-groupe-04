import React from 'react'
import Background from '../../Components/Template/Background/Background'
import Navbar1 from '../../Components/Template/Navbar1/Navbar1'
import './Formation.css'

/* Quelque style utiles */
const Title = {
  color: "white", textAlign: "center", textDecoration: 'underline 2px white', fontStyle: 'italic', overflowY: 'hidden'
}

const Resume = {
  textAlign: "justify", paddingTop: '30px'
}

const Salary = {
  textAlign: "end", paddingTop: '5%', color: 'gold'
}

const Other = {
  fontStyle: 'italic', textAlign: 'end', fontSize: "12px"
}


export default function Formation() {
  return (
    <>
      <Background />
      <Navbar1 />

      <h1 className="mb-1 h-1" style={{ color: "white", textAlign: "center", paddingTop: "20px" }}> Les métiers de l'audiovisuel  </h1>

      <div className="container">


        <section>
          <h1 className="mb-1 h-1" style={Title}> Animateur(trice) de 2D et 3D  </h1>
          <p style={Resume}> Maître du mouvement, l'animateur 2D et 3D est d'abord un artiste, spécialiste des images de synthèse. Cinéma, jeux vidéo, publicité ou site Internet, les projets d'animation ne manquent pas, et attirent de plus en plus de jeunes.<br />
            <p style={Salary}> Salaire débutant : 2 000€ <span style={Other}><br />Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Animateur(trice) de de radio et de télévision   </h1>
          <p style={Resume}> l est sympathique et toujours de bonne humeur, il parle vite et bien, répond du tac au tac ! Une spontanéité qui demande à l'animateur radio ou télé une préparation approfondie de chaque émission. Objectif : capter un maximum d'auditeurs ou de téléspectateurs.
            <p style={Salary}> Salaire débutant : 1 600€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Assistant(te) de réalisateur(trice)  </h1>
          <p style={Resume}> Organiser les repérages, mettre au point le plan de travail, fixer l'heure du maquillage... l'assistant réalisateur est le collaborateur direct du réalisateur. Il assure le lien entre ce dernier, les acteurs et l'équipe technique..
            <p style={Salary}> Salaire débutant : 1 500€  <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Cadreur(se)   </h1>
          <p style={Resume}> Un panoramique réussi, un mouvement de travelling impeccable... c'est l'oeuvre du cadreur, qui assure la prise de vues. Un métier très convoité au cinéma, mais qui est plus accessible en reportage ou sur un plateau de télévision.
            <p style={Salary}> Salaire débutant : 1 600€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Chargé(e) de production  </h1>
          <p style={Resume}> Le chargé de production collabore à la création d'un film, d'une émission de télévision, d'un spectacle. Responsable du budget, il supervise la production et assure la gestion matérielle et humaine du projet.
            <p style={Salary}> Salaire débutant : 2 400€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Chef(fe)monteur(se) </h1>
          <p style={Resume}> Après le tournage, le chef monteur donne du sens et une esthétique à un projet audiovisuel en choisissant et assemblant les plans, et en calant le son. Il exerce son art dans l'ombre du réalisateur, avec un sens de l'écoute non dénué d'esprit critique.
            <p style={Salary}> Salaire débutant : 2 300€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Directeur(trice) de la photographie   </h1>
          <p style={Resume}> Quel point commun entre une séquence de cinéma, une émission de télévision et un spot publicitaire ? Une image travaillée par le directeur de la photographie. Avec une attention particulière portée aux couleurs, à la lumière et au cadrage.
            <p style={Salary}> Salaire débutant : 2 000€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Ingénieur(e) du son  </h1>
          <p style={Resume}> À la fois artiste et technicien, l'ingénieur du son assure la qualité du son produit pour une réalisation audiovisuelle, un album de musique, un concert ou un spectacle. Il allie pratique musicale et maîtrise de technologies complexes.
            <p style={Salary}> Salaire débutant : 2 500€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Journaliste-reporter d'images   </h1>
          <p style={Resume}> Journaliste de terrain par excellence, le journaliste reporter d'images (JRI) est spécialisé dans la réalisation de reportages pour la télévision, les agences de presse audiovisuelle, les sociétés de production... Caméra à l'épaule, il enregistre les images et le son. Il rédige ensuite un commentaire et le monte sur images pour finaliser son sujet.
            <p style={Salary}> Salaire débutant : 2 500€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Machiniste constructeur(trice) ou plateau   </h1>
          <p style={Resume}> Il n'a pas son pareil pour faire apparaître et disparaître un décor. Peu reconnu, le machiniste-constructeur est pourtant indispensable. Un métier tremplin pour accéder à d'autres fonctions.
            <p style={Salary}> Salaire débutant : 1 500€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Mixeur(se) son   </h1>
          <p style={Resume}> Le mixeur son mélange les voix, les musiques, les ambiances... pour donner à un film ou à un disque une ambiance sonore. Une technique complexe qui exige une certaine sensibilité musicale.
            <p style={Salary}> Salaire débutant : 1 600€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Photographe  </h1>
          <p style={Resume}> Faire des prises de vue, tel est l'objectif de tout photographe. Pourtant, les emplois se situent surtout dans le tirage et la vente, sous des statuts variés, et les lieux d'exercice sont très divers : laboratoire, studio, extérieur.
            <p style={Salary}> Salaire débutant : 1 900€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Régisseur(se) générale   </h1>
          <p style={Resume}> Lors du tournage d'un film, le régisseur général assure la logistique. Il accueille les comédiens, trouve des places de parking, achemine le matériel technique... À lui de gérer le quotidien des plateaux pour que tout se passe au mieux.
            <p style={Salary}> Salaire débutant : 2 300€  <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Scénariste   </h1>
          <p style={Resume}> Adapter un roman noir pour le grand écran, prévoir tous les rebondissements d'une saga familiale pour la télévision, concevoir un nouveau jeu vidéo ou d'animation en 3D... autant de défis relevés par un professionnel de l'écriture : le scénariste.
            <p style={Salary}> Salaire débutant : 1 500€ <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Scripte   </h1>
          <p style={Resume}> Chronomètre et stylo en main, le scripte note les particularités de chaque séquence filmée. Garant de la cohésion d'un enregistrement, il se souvient de chaque détail et s'assure que les raccords entre les tournages passent inaperçus.
            <p style={Salary}> Salaire débutant : 2 000€  <br /><span style={Other} >Salaire brut</span></p></p>
          <span className="fas fa-times"></span>
        </section>

        <section>
          <h1 className="mb-1 h-1" style={Title}> Votre teste   </h1>
          <p> Votre test vous oriente vers : WIP</p>
          <span className="fas fa-times"></span>
        </section>


      </div>




    </>
  )
}
