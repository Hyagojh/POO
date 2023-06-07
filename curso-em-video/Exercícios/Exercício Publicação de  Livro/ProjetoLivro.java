package projetoLivro;
public class projetoLivro {
    public static void main(String[] args) {
    
    Pessoa[] p = new Pessoa [2];
    Livro[] l = new Livro [2];
    
    p[0] = new Pessoa (" Hyago", 20, " M");
    p[1] = new Pessoa (" Izadora", 20, " F");
    
    l[0] = new Livro ("12 Regras para vida", "Jordan Peterson", 428, p[0]);
    l[1] = new Livro ("Desinformação", "Ion Mihai Pacepa", 500, p[1]);
    
        l[0].abrir();
        l[0].folhear(1000);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
    
}
