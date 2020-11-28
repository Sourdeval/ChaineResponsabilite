package respochain;

public class BrutalForceHandler extends BaseHandler{

	

	
	public BrutalForceHandler(DataBase d) {
		super(d);
	}

	public void handle(String id, String pass) {
		nextHandling(id, pass);
	}

}
