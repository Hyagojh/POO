package Aula05;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
             
        l[0] = new Lutador ("Hyago", "Brasil", 20, 1.75f, 80.5f, 99, 0, 0);
        
        l[1] = new Lutador ("Ronaldo", "Brasil", 1000, 1.95f, 200.5f, 0, 0, 99);

        l[2] = new Lutador ("Messi", "Argentina", 32, 1.70f, 65.5f, 9, 3, 2);
        
        l[3] = new Lutador ("Ali", "França", 21, 1.75f, 80.0f, 7, 0, 5);
        
        l[4] = new Lutador ("Popó", "Brasil", 200, 1.70f, 70.5f, 19, 10, 7);
               
        l[5] = new Lutador ("Tyson", "Brasil", 50, 1.85f, 100.5f, 99, 0, 0);
      
            
        Luta UEC01 = new Luta(); //novo objeto da classe luta, ou seja um novo evento de luta
        UEC01.marcarLuta(l[0], l[3]);
        UEC01.lutar();
    }
    
}
