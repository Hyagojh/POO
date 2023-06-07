package Aula05;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("CHEGOU A HORA!");
        System.out.println("Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente do(a): " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos");
        System.out.println("Pesando: " + this.getPeso() + " Kg" + " e com a altura de: " + this.getAltura() + "m");
        System.out.println("com um cartel de: " + "Vitórias: " + this.getVitorias()+ ", Derrotas: " + this.getDerrotas() + ", Empates: " + this.getEmpates());
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("com um cartel de: " + "Vitórias: " + this.getVitorias()+ ", Derrotas: " + this.getDerrotas() + ", Empates: " + this.getEmpates());
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+ 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso() < 52.2){
            this.categoria = "Inválido, peso fora do padrão.";
        } else if (getPeso() <= 70.3){
            this.categoria = "Peso leve";
        } else if (getPeso() <= 83.9){
            this.categoria = "Peso médio";
        } else if (getPeso() <= 120.2){
            this.categoria = "Peso pesado";
        }else {
            this.categoria = "Inválido, peso fora do padrão.";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
