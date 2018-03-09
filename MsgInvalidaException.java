
public class MsgInvalidaException extends RuntimeException {
	@Override
	public String getMessage(){
		return "Mensagem inexistente ou com conteúdo inválido.";
	}
}
