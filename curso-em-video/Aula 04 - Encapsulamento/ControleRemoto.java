package Aula04;
public class ControleRemoto implements Controlador { 
//A classe "ControleRemoto" implementa a interface controlador  
    
    private int volume;      //importante que classes encapsuladas tenham seus atributos privados.
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() { //construtor
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;    
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //métodos abstratos

    @Override /*significa que esse método sobrescreve os métodos abstratos que
    anteriormente não tinham sido definidos.*/
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        /*Enquanto o contador "i" for menor que o volume atual, i = i +10;
          ou seja, a cada 10 números de volume, uma barra vai aparecer na tela*/    
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){ //Ao chamar o get não precisa especificar ''true'', caso n tenha nenhum parâmetro já é true.
            this.setVolume(this.getVolume() + 5); //Soma o valor atual do objeto com 5
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){ /*Testa se está ligado e não está tocando*/
            this.setTocando (true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando (false);
        }
    }
    
}
