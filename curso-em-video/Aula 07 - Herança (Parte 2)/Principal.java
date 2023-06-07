package Aula07;
public class Principal {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); como a classe é abstrata n pode ser instanciada
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Claudio");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Richarlison ");
        b1.pagarMensalidade();
    }
}
