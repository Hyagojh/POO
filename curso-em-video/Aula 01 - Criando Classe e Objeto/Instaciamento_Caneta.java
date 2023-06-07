package Aula01;


public class Instaciamento_Caneta {
    public static void main(String[] args) {
        /*
         * Cria uma instância da classe , ou seja, um objeto. c1 é um objeto da classe caneta.
         * O que vem depois de new é a classe que vai ser utilizada e antes é o nome do objeto criado.
        */    
        Caneta c1 = new Caneta(); 
        
        c1.cor = "Azul";  //O atributo cor do objeto c1 da classe caneta recebe cor azul;
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampada = false; 
        c1.modelo = "BIC";
        
        c1.tampar();   //chama o método tampar
        c1.status(); 
        c1.rabiscar(); 

        //cria um novo objeto.
        Caneta c2 = new Caneta();
        c2.cor = "vermelha";
        c2.modelo = "BIC2";
        c2.tampada = true;
        
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
