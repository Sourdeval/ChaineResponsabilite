package respochain;

public class BrutalForceHandler extends BaseHandler{

	
	private static final int MAX_ATTEMPTS = 10;

	public BrutalForceHandler(DataBase d) {
		super(d);
	}

	public void handle(String id, String pass) {
		if(data.attempts(id)>=MAX_ATTEMPTS) {
			System.out.println("Rentre chez toi, hacker du dimanche, tu as �puis� tes tentatives de connexion.");
			System.out.println("Traitement termin�.");
		}
		else {
			System.out.println("Tentative de connexion...");
			nextHandling(id, pass);
		}

	}

}
