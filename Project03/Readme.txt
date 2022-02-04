L'objectif du Project03 est créer une page hmtl qui contient un lien vers votre Servlet. Ce dernier affiche Bonjour votre nom et prénom.

J'ai utilisé Eclipse IDE for Enterprise Java and Web Developers pour écrire les codes java ('salutations.java') et html ('input.html').
De plus, j'ai utilisé Apache Tomcat qui est un serveur d'applications, plus précisément un conteneur web libre de servlets version 9.0.
Il faut connecter Tomcat à l'Eclipse IDE.

#La demarche
Le serveur reçoit du navigateur la requête http qui a recours à une servlet.
Le serveur crée un objet qui représente la requête http ainsi que l'objet qui contiendra la réponse et les envoie à la servlet.
La servlet crée dynamiquement la réponse sous forme de page html dont l'objet contient la réponse. 
Le serveur récupère l'objet réponse et envoie la page html.

Vous trouverez une print-screen ('Resultat Project03.png') 
qui montre une page où vous pouvez remplir les données demandées et une autre qui affiche le résultat: Bonjour 'prénom' 'nom'.

