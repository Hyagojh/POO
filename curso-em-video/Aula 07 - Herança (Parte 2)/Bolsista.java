package Aula07;
public class Bolsista extends Aluno {
//bolsista herda tudo de aluno, consequentemente herda tudo de pessoa também.
    private float bolsa;

    public float setBolsa (float b){
    	this.bolsa = b;
    }

    public float getBolsa (){
    	return this.bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa");
    }
    
    /*sobreescreve a mensalidade do aluno normal, tendo dois métodos com mesmo 
    nome mas com funções diferenes para cada classe*/
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "é bolsista, não paga.");
    }
    
}
