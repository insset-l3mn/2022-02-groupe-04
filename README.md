# A propos du projet ...

![Visuel de la page Formation](/docs/Images/-Formation.png)

## Description rapide du projet ...

Ce projet a pour but la **Réalisation d'une application JakartaEE pour la gestion des formations**, pour cela nous avons donc du commencer par choisir sur quel domaine notre système de gestion des formations portera, nous avons donc choisi le monde de ***l'audiovisuel***.

L'idée de ce projet est de permettre à différents utilisateurs d'effectuer un "test", nommé questionnaire plus tard, lui permettant de se rendre compte de quelle formation est la mieux adaptée selon les réponses qu'il aura donné durant ce questionnaire. 
Ce questionnaire comprendra des questions, des QCM mais aussi des parties en réalité virtuelle, ainsi que des dépôts de projet à rendre.

### Build With :
* 🐙 Github
* 🖥️ VSCode
* 🫘 NetBeans
* 🔥 Payara
* 🐇 React
* 🐢 Jakarta EE8

## Commençons !

Pour obtenir un copie local du projet, effectuez les commandes suivantes (on ne compte pas l'installation de Payara ainsi que les connections BDD) :

#### Git
```sh
git clone https://github.com/insset-l3mn/2022-02-groupe-04
```
#### MySQL
```sh
lancer les scripts "V1" et "question" se trouvant dans /docs/MySQL
```
#### NetBeans 
```sh
Run Payra
Clean & Build "audiovisuel"
RUN "audiovisuel"
```
#### VSCode
```js
npm i
npm -start
```
#### Payra and others
```html
http://richard.grin.free.fr/itu-madagascar/tp/installations/index.html
```

## Architecture de l'application ...
![UML](/docs/Diagram/UML.png)

Présentation du diagramme de classe :

Le point central de notre diagramme est la classe Graph, qui contiendra en attribut,
son id, l'id de l'utilisateur, nous verrons pourquoi après, ainsi que son type, 
qu'il soit partiel, global ou aggrégé.

En effet, notre digramme va suivre une structure dépendante de ce graph.
Nous allons avoir un Graph de compétences qui sera notre graph initial.
Puis, grâce à ce graph nous allons générer un questionnaire initial,
qui sera composé de questions possédants en attribut leur id, leur intitulé,
leurs propositions de réponses, ainsi que le thème.
Puis, suite aux réponses de l'utilisateur, il obtiendra son propre graph utilisateur
(Voilà pourquoi nous avons l'idUser dans Graph).


C'est grâce à ce graph que nous allons pouvoir diriger l'utilisateur vers la formation
la plus adapté.
Si le graph utilisateur n'a pas assez d'informations pour diriger l'utilisateur vers une formation adapté,
il y a la possibilité d'affiner en posant de nouvelles questions.
Au niveau des attributs de l'utilisateur, il possédera son id, son mail, son password,
son rôle et sa formation.
En fonction de son rôle, l'utilisateur pourra agir sur les questions, c'est à dire 
qu'avec le rôle "Formateur", qui équivaut à un rôle admin, il va pouvoir ajouter,
modifier ou supprimer des questions.

En conclusion, un graph de compétence est généré, qui va lui-même générer un questionnaire. 
Un utilisateur répond aux questions et obtient un Graph utilisateur, qui va lui générer la formation la plus adapté.

## Diagramme de navigation ...
![Diagramme de navigation](/docs/Diagram/SiteMap.png)

Ici, vous pouvez retrouver les routes actuellement disponibles dans la partie front-end. En effet toutes les pages (sauf une) sont accessibles de partout via la barre de navigation se situant tout en haut de la page. 

Certaines pages sont limitées en accès, c'est à dire qu'il vous faut vous connecter avec un compte particulier pour accéder aux pages. Les pages "...Admin" sont réservées aux admin, c'est à dire aux personnes connectés possédant le rôle de "FORMATEUR", ainsi que la page "Questionnaire" uniquement accessible si vous êtes connecté sur site, ce qui permettra d'enregistrer le questionnaire effectué par les utilisateurs.

## Scènario de la démo ...
* Un utilisateur arrive sur le site, se rend compte de ne pouvoirs accèder a la page de questionnaire (qui ne fonctionne pas encore) décide d'aller s'inscrire via la page d'enregistrement des nouveaux utilisateurs, il prendra le rôle de **Formateur** pour montrer aussi les fonctionnalités de ce role, tel la gestion des utilisateurs mais aussi des questions pour le futur questionnaire.
* Cliquez sur l'image pour être redirigé vers la vidéo démo !
[![Démo](/docs/Images/-Formation.png)](https://drive.google.com/file/d/19yLeqRA6mT36Q0OzAjJZAIm9TCHm5ok0/view?usp=sharing)

## Contact

* WATISSE Corentin - [@WatisseCorentin](https://twitter.com/WatisseCorentin) - corentinwatisse@gmail.com

* SIMONIN  Nicolas - [@Luffy_s_Gamer](https://twitter.com/Luffy_s_Gamer) - simonin.nico@gmail.com



