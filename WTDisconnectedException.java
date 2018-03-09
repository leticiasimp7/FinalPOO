
public class WTDisconnectedException extends Exception{
	@Override
	public String getMessage(){
		return "Usuário offline. Tente novamente mais tarde.";
	}
	
	
}
