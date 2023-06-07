package Aula02;

public class Caneta {    
	/*
     * A classe caneta possuí um modelo do tipo string e que é publico
     * ou seja qualquer um tem acesso
    */
    public String modelo; 
    public String cor;
    //Ponta é um atributo privado, ou seja, só a classe tem acesso e é capaz de alterá-lo.
    private float ponta;
    //Atributos protegidos só podem ser acessados ou alterados por sua classe e subclasses.
    protected int carga;
    protected boolean tampada;
    
    public void status (){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
          }
    }
    
    protected void tampar (){
        this.tampada = true; 
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    
}
