package ExercicioBanco;
public class Instanciamento_Conta {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Hyago");
        p1.abrirConta("CP");
        p1.depositar(350);
        p1.sacar(300);
        p1.estadoAtual();
    }
}

