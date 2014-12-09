public class Palavra extends Elemento implements Rotacionavel {
	private String p;
	public Formatacao formatacao;
	formatacao = new Formatacao();
	public void setP(String p){
		this.p = p;
	}

	public String getP(){
		return this.p;
	}

}