package respochain;

public class GiftHandler extends BaseHandler{

	public GiftHandler(DataBase d) {
		super(d);
	}

	public void handle(String id, String pass) {
		if(data.connexions(id)==1000) {
			System.out.println("Vous avez gagn� 10000 demi-centimes.");
			nextHandling(id,pass);

		}
		else {
			System.out.println("Vous avez presque tir� le gros lot.");
			nextHandling(id,pass);
		}
	}

}
