
public class MsgInvalidaException extends RuntimeException {
	@Override
	public String getMessage(){
		return "Mensagem inexistente ou com conte�do inv�lido.";
	}
}
