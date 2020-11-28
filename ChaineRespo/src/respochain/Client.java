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
		handler1.handle("John Doe", "azerty123");
		
	}

}
