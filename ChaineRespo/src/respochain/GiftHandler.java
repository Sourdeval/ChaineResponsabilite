package respochain;

public class GiftHandler extends BaseHandler{

	public void handle(String id, String pass) {
		if(data.connexions(id)==1000) {
			System.out.println("Vous avez gagné 10000 demi-centimes.");
		}
		else {
			System.out.println("Vous avez presque tiré le gros lot.");
			nextHandling(id,pass);
		}
	}

}
