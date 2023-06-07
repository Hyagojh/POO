package Aula05;

import static java.lang.Math.random;
import java.util.Random;

public class Luta {
    
    private Lutador desafiado; //Utiliza a classe "Lutador"
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
    /*Recebe dois lutadores, que são tipos abstratos de dados e fazendo isso todos os métodos dessa classe
    podem ser utilizados aqui, no relacionamento de agregação.*/
        if (l1.getCategoria().equals (l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random (); /*gerador de valores aleatorios*/
            int vencedor = aleatorio.nextInt(3); /*vai gerar 3 resultados: 0, 1 ou 2*/
        
            switch (vencedor){
                case 0:
                    System.out.println("A luta terminou em empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1:
                    System.out.println("Vitória do " +this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println("Vitória do " +this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else {
            System.out.println("A luta nao pode acontecer!");
        }
    }
    
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    
    public int getRounds(){
        return this.rounds;
    }
    
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    
    public boolean getAprovada(){
        return this.aprovada;
    }
    
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
}
