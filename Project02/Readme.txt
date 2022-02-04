L'object du Project02 est de créer une application distribuée en utilisant le middleware RMI.

J'ai utilisé notepad et JDK version 1.8

Vous trouverez une print-screen ('Resultat.png') de 3 terminaux (fenêtres pour rmiregistry, serveur et client)
Etape 1:
Il faut commencer par rmiregistry qui démarre localhost (un serveur de naming) afin d'associer une url avec l'objet CalculatorImpl sur le port 1099. (par défaut)

Etape 2:
Il faut démarrer le serveur.
CalculatorServer fait rebind pour une url sur la rmiregistry avec l'objet CalculatorImpl 'c' que j'ai instancié.

Etape 3:
Il faut démarrer le client.
CalculatorClient est en train de faire un lookup dynamique sur le stub 'c' dans CalculatorClient et ensuite invoquer les méthodes sub, add, mult et div.

