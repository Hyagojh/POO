
package Aula02;

public class Instancia_Caneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        c1.carga = 80;
        //c1.ponta = 0.5f gera erro pois o atributo é privado.
        /*
         * embora carga seja protegida, o método main, que está executando, está
         * dentro de uma classe que utiliza a classe caneta, main está dentro do pacote
         * aula02 e está utilizando a classe Caneta_Aula02, por isso é permitido a modificação
         * de atributos protegidos, sendo considerado uma subclasse.
        */
        c1.tampada = true;
        c1.status();       
    }
    
    
}
