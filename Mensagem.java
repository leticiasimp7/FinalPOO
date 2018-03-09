
public abstract class Mensagem {
	private String remetente;
	private WTTextual destinatario;
	protected String conteudo;
	private Mensagem m;
	
	
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	public WTTextual getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(WTTextual destinatario) {
		this.destinatario = destinatario;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Mensagem(String remetente, WTTextual destinatario){
		setRemetente(remetente);
		setDestinatario(destinatario);
	}
	
	public String verConteudo(){
		return getConteudo();
	}
	
	
}
