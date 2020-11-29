package respochain;

public abstract class BaseHandler implements IHandler {
	
	protected IHandler next;
	protected DataBase data;
	
	public BaseHandler(DataBase d) {
		next=null;
		data=d;
	}
	
	@Override
	public void setNext(IHandler h) {
		next=h;
	}

	@Override
	public abstract void handle(String id, String pass);

	public void endRequest() {
		System.out.println("Traitement terminé.");
	}
	
	public void nextHandling(String id, String pass) {
		if(next==null) {
			endRequest();
		}
		else {
			next.handle(id, pass);
		}
	}
}