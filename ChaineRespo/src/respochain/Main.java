package respochain;

public class Main {

	public static void main(String[] args) {
		
		//Initialisation
		DataBase d = new DataBase();
		BruteForceHandler handler1 = new BruteForceHandler(d);
		ConnexionHandler handler2 = new ConnexionHandler(d);
		GiftHandler handler3 = new GiftHandler(d);
		handler1.setNext(handler2);
		handler2.setNext(handler3);

		//Partie client
		System.out.println("Traitement de la demande de M. Douzième Requête :");
		handler1.handle("Douzième Requête", "azerty123");
		System.out.println("Traitement de la demande de M. Mauvais Mot de Passe :");
		handler1.handle("Mauvais Mot de Passe", "qwerty123");
		System.out.println("Traitement de la demande de Chuck Norris :");
		handler1.handle("Chuck Norris", "azerty123");
		
	}
}
