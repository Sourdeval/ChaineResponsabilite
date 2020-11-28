package respochain;

public interface IHandler {
	public void setNext(IHandler h);
	public void handle(String id, String pass);
}
