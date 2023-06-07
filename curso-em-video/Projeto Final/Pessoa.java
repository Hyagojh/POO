public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private float Experiencia;

	public Pessoa (String nome, int idade, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}

	public void ganharExp (){

	}

	public String getNome (){
		return this.nome;
	}

	public void setNome (String nome){
		this.nome = nome;;
	}


	public int getIdade (){
		return this.idade;
	}

	public void setIdade (int idade){
		this.idade = idade;
	}

	public String getSexo (){
		return this.sexo;
	}
	
	public void setSexo (String sexo){
		this.sexo = sexo;
	}

	public float getExperiencia (){
		return this.experiencia;
	}

	public void setExperiencia (float experiencia){
		this.experiencia = experiencia;
	}

	@Override
	public String toString (){
		return "Pessoa {" + "Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo + ", experiencia = " + experiencia = "}";
	}

}