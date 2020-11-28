package respochain;

public abstract class BaseHandler implements IHandler {
	
	protected IHandler next;
	protected DataBase data;
	
	public BaseHandler() {
		next=null;
	}
	
	@Override
	public void setNext(IHandler h) {
		// TODO Auto-generated method stub
		next=h;
		
	}

	@Override
	public abstract void handle(String id, String pass);

	public void nextHandling(String id, String pass) {
		if(next==null) {
			System.out.println("Traitement terminé.");
		}
		else {
			next.handle(id, pass);
		}
		
	}
}