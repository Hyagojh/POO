package Aula04;
public interface Controlador { //criação da interface e seus métodos abstratos
    
    public abstract void ligar(); 
    /*cria método abstrato. Abstrato significa que o método será desenvolvido em outro lugar, um lugar que 
    implemente essa interface*/
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
