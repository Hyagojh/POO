package Aula08;
public class Principal {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero ();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe ();
        Aves a1 = new Aves ();
        Canguru c1 = new Canguru ();
        Cobra C = new Cobra ();
        Tartaruga t1 = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara a = new Arara();
        
        
        m1.setPeso (35.3f);
        m1.setCorPelo("Marrom");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();
        
        c1.locomover();
/*locomover em m1 e c1 é diferente, polimorfismo de sobreposição, 
onde temos a mesma assinatura e nome, mas em classes diferentes.*/
        
    }
}
