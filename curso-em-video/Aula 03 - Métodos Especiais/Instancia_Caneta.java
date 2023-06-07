
package Aula03;

public class Instancia_Caneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); 
        c1.setModelo ("BIC");
        c1.setPonta (0.5f);
    /*
     * não será permitido alterar o valor do atributo com apenas "c1.ponta = 0.5f"
     * Como ponta é privado, é necessário usar um método modificador, para pedir permissão para 
     * fazer alguma alteração no atributo. Com isso eu passo por parâmetro o valor 0.5f
     * onde lá dentro do método o 'p' recebe o valor e armazena this.ponta
    */ 
        c1.status();
        
    /*
     * Caneta c2 = new Caneta ("NIC", 0.5f);
     * Que cria o objeto usando o construtor, dessa forma eu posso em 1 linha setar todos os atributos
     * que foram definidos no método construtor e criar quantos objetos quiser, economizando tempo e código. 
    */
        
    }
    
}
