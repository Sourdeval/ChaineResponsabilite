package respochain;

public class ConnexionHandler extends BaseHandler{



	public ConnexionHandler(DataBase d) {
		super(d);
	}

	public void handle(String id, String pass) {
		if(data.connectionOK(id,pass)) {
			System.out.println("Connexion effectuée.");
			nextHandling(id,pass);
		}
		else {
			System.out.println("Veuillez apprendre votre mot de passe ou le stocker sur KeePass.");
		}
	}
}
