package Aula01;

public class Caneta {
	/* 
	 * A classe caneta tem um atributo chamado "modelo" do tipo string.
     * E seus atributos não tem visibilidades explícitas. Todas as classes
     * em Java começam com letra maiúscula.
    */ 
    String modelo; 
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status (){
    /*
     * Status é um método dessa classe, identificado por '()', e esse método mostra na tela
     * alguns status do objeto. this é uma autoreferência ao objeto que chamou, o this referencia por exemplo "c1", 
     * O this interpreta qual objeto (c1 ou c2) que chama e devolve o resultado equivalente.
    */
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
          }
    }
    
    void tampar (){
        this.tampada = true; 
    }
    
    void destampar(){
        this.tampada = false;
    }
}
