package Aula09;
public class Principal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        //exemplo sobrecarga mesmo nome diversas assinaturas
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);

        /*LEMBRANDO: Sobreposição: Mesma assinatura e classes diferentes.
        			 Sobrecarga: Assinaturas diferentes e mesma classe.*/
        
        
        
    }
}
