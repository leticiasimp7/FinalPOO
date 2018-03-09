
public class LongTextMsg extends Mensagem{
	
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
	public LongTextMsg( String remetente, WTTextual destinatario, String texto)throws MsgInvalidaException{
		try{
			super(remetente,destinatario);
		
		setRemetente(remetente);
		setDestinatario(destinatario);
		setTexto(texto);
	}
	catch{
		MsgInvalidaException();
	}


}
