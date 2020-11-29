package respochain;

public class BruteForceHandler extends BaseHandler{

	private static final int MAX_ATTEMPTS = 10;

	public BruteForceHandler(DataBase d) {
		super(d);
	}

	public void handle(String id, String pass) {
		if(data.attempts(id)>=MAX_ATTEMPTS) {
			System.out.println("Rentre chez toi, hacker du dimanche, tu as épuisé tes tentatives de connexion.");
			endRequest();
		}
		else {
			System.out.println("Tentative de connexion...");
			nextHandling(id, pass);
		}

	}

}
