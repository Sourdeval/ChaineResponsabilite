package respochain;

public class ConnexionHandler extends BaseHandler{



	public void handle(String id, String pass) {
		if(data.connectionOK(id,pass)) {
			System.out.println("Connexion effectu�e.");
			nextHandling(id,pass);
		}
		else {
			System.out.println("Veuillez apprendre votre mot de passe ou le stocker sur KeyPass.");
		}
	}
}
