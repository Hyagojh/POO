package Aula03;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    
    public Caneta(){
    /*
     * aqui é o criado o método construtor, ou seja, todo objeto instanciado terá
     * os seus atributos definidos nesse bloco, isso pode ser alterado depois, mas inicialmente
     * os atributos serão esses. É identificado por ter o mesmo nome da classe.
    */
        this.modelo = "BIC Cristal";
        this.ponta = (1.0f);
        this.tampada = true;
    } 
    /*
     * O método constructor também permite que o criador do objeto defina os atributos iniciais
     * fazendo o uso já de métodos especiais e passagem de parâmetro.
        
    public Caneta(String m, float c) {
        setModelo(m); ou this.modelo = m;
        this.ponta = c;
        this.tampar();
    }*/
    
    public String getModelo(){
        return this.modelo;
    /*
     * Os getters são usados para ter acesso a informações privadas, o objeto vai solicitar o modelo
     * (nesse caso) e o método, que tem acesso aos atributos privados por ser uma funcionalidade da classe
     * vai retornar esse modelo para o usuário, fazendo o uso da autoreferência "this".
    */
    }
    
    public void setModelo(String m){
        this.modelo = m;
    /*
     * Os setters são usados para alterar informações em atributos privados a partir da autoreferência, o objeto
     * vai solicitar que seja armazenada no atributo modelo uma determinada String(no caso) e a string vai ser
     * armazenada no modelo do objeto. o modelo C1 recebe a string M. Sem que o usuário tenha acesso direto ao atributo.
    */
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p; 
    }
    
     public void tampar(){
        this.tampada = true;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Calibre da ponta: " + this.getPonta());
        System.out.println("Está tampada: " + tampada);
    }
}
