package respochain;

public class DataBase {

	public int attempts(String id) {
		if(id.equals("John Doe"))
		return 1000;
		else {
			return 0;
		}
	}

	public boolean connectionOK(String id, String pass) {
		if(id.equals("Francis Cabrel")) {
			return false;
		}
		else {
			return true;
		}
	}

	public int connexions(String id) {
		return 1000;
	}
	
}
