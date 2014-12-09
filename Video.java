public class Video extends Elemento implements Transformavel{
	private String n;
	public Tamanho tamanho;
	tamanho = new Tamanho();
	public void setVideo(String a){
		this.n = a;
	}

	public getVideo(){
		return this.n;
	}
}