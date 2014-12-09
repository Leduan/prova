public class Figura extends Elemento implements Rotacionavel,Transformavel{
	private String n;
	public Tamanho tamanho;
	tamanho = new Tamanho();
	public void setFigura(String h){
		this.n = h;
	}

	public getFigura(){
		return this.n;
	}

}