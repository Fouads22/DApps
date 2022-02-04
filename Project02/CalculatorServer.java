// C'est le programme serveur

import java.rmi.Naming;
public class CalculatorServer {
public CalculatorServer() {
try {
//est l'objet serveur qui va etre exporte de reference type Calculator (contrat)
Calculator c = new CalculatorImpl(); //Exportation implicite
//Bind sur le rmiregistry
Naming.rebind("rmi://localhost:1099/CalculatorService", c);
} catch (Exception e) { System.out.println("Trouble: " + e); }
}
public static void main(String args[]) { new CalculatorServer(); }
} 