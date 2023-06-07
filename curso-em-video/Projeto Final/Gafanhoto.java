public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistido;

	public Gafanhoto (String nome, int idade, String sexo, String login){
		//super indica os parâmetros da superclasse.
		super (nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	public void viuMaisUm (){

	}

	public String getLogin (){
		return this.login
	}

	public void setLogin (String login){
		this.login = login;
	}

	public int getTotAssistido (){
		return this.totAssistido;
	}

	public void setTotAssistido (int totAssistido){
		this.totAssistido = totAssistido;
	}

	@Override 
	public String toString (){
		//super.toString chama os dados da superclasse e os agrupa.
		return "Gafanhoto{" + super.toString() + "\nLogin = " + login + "Total de Vídeos Assistidos: " + totAssistido + "}";
	}
}