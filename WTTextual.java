
public class WTTextual extends Mensagem {
	public WTTextual(String remetente, WTTextual destinatario) {
		super(remetente, destinatario);

	}

	private String nickname;
	private boolean estaOnline;
	private Mensagem msgAtual;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public boolean isEstaOnline() {
		return estaOnline;
	}
	public void setEstaOnline(boolean estaOnline) {
		this.estaOnline = estaOnline;
	}
	public Mensagem getMsgAtual() {
		return msgAtual;
	}
	public void setMsgAtual(Mensagem msgAtual) {
		this.msgAtual = msgAtual;
	}
	
	
	
	
	public String verStatus(){
		if(isEstaOnline()==false){
			return "<nickname> está offline :(";
			
		}
		return"<nickname> está online :)";
	}

	public void conectar(){
		setEstaOnline(true);
	}
	
	public void desconectar(){
		setEstaOnline(false);
	}
	
	public boolean estaOnline(){
		if(estaOnline()==true ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void enviarMsg(WTTextual dest, int opc)throwsWTDisconnectedException {
		if(getDestinatario().estaOnline()==true){
			QuickEmoticonMsg a = new QuickEmoticonMsg(getRemetente(), getDestinatario(), getOpcao());
			receberMsg(msgAtual);
		}
		else{
			new throw WTDisconnectedException()
			
		}
	}

	
	public void WTTextual(String nickname){
		setNickname(nickname);
		
	}
	
	private void receberMsg(Mensagem msg){
		System.out.println(getRemetente()+getConteudo());
	}
	
	public void enviarMsg(WTTextual dest, String txt){
		if(getDestinatario().estaOnline()==true){
			LongTextMsg b = new LongTextMsg(getNickname(), getDestinatario(), getConteudo());
			receberMsg(msgAtual);
		}

	}
	


}
