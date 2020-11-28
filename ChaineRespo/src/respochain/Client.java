package respochain;

public class Client {

	public static void main(String[] args) {
		
		//Initialisation
		DataBase d = new DataBase();
		BrutalForceHandler handler1 = new BrutalForceHandler(d);
		ConnexionHandler handler2 = new ConnexionHandler(d);
		GiftHandler handler3 = new GiftHandler(d);
		handler1.setNext(handler2);
		handler2.setNext(handler3);

		//Partie client
		System.out.println("Traitement de la demande de John Doe :");
		handler1.handle("John Doe", "azerty123");
		System.out.println("Traitement de la demande de Francis Cabrel :");
		handler1.handle("Francis Cabrel", "azerty123");
		System.out.println("Traitement de la demande de Chuck Norris :");
		handler1.handle("Chuck Norris", "azerty123");
		
	}

}
