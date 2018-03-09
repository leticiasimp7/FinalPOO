
public class QuickEmoticonMsg extends Mensagem {
	private String SMILE_FACE = ":D";
	private String SAD_FACE = ":/";
	private String CRYING_FACE= "T-T";
	private String SURPRISE_FACE = ":O";
	private String HEART = "<3";
	private String opcao;
	
	public String getOpcao(){
		return this.opcao=opcao;
	}
	public String getSMILE_FACE() {
		return SMILE_FACE;
	}
	public String getSAD_FACE() {
		return SAD_FACE;
	}
	public String getCRYING_FACE() {
		return CRYING_FACE;
	}
	public String getSURPRISE_FACE() {
		return SURPRISE_FACE;
	}
	public String getHEART() {
		return HEART;
	}

	
	
	public QuickEmoticonMsg(String remetente, WTTextual destinatario, String opcao) throws MsgInvalidaException{	
		super(remetente,destinatario);
		try{
			setConteudo(getRemetente()+getDestinatario()+ getOpcao());
		}
		catch(MsgInvalidaException w){
			System.out.println(w);
		}
	}
	
	public String selecionarOpc(String opcao){
		if(opcao=="1"){
			setConteudo(getSAD_FACE());
		}
		else if(opcao=="2"){
			setConteudo(getCRYING_FACE());
		}
		else if(opcao=="3"){
			setConteudo(getSURPRISE_FACE());
		}
		else if(opcao=="4"){
			setConteudo(getHEART());
		}
		else{
			setConteudo(getSMILE_FACE());
		}
		return getConteudo();
	}
}
