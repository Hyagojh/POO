package ExercicioBanco;
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("=================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("=================================");
    }
        
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.saldo = 50;            
        } else if (t == "CP"){
            this.setSaldo (150);            
        }   
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){  
       if (this.getSaldo() > 0){
           System.out.println("ERRO: Conta com dinheiro.");
       } else if (this.getSaldo() < 0){
           System.out.println("ERRO: Conta em débito.");
       } else{
           this.setStatus(false);
           System.out.println("Conta fechada com sucesso!");
       }
    }

    public void depositar(float d){
        if (this.getStatus()){
            this.setSaldo(getSaldo()+d);
            System.out.println("Depósito realziado na conta de: " + this.getDono());
        } else{
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(float s){
        if (status == true){
            if (this.getSaldo() >= s){
                this.saldo -= s;
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else if (this.getSaldo() < s){
            System.out.println("Impossível sacar, saldo insuficiente");
            }  
        } else if (status == false){
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    
    public void pagarMensal(float m){
        if (this.getTipo() == "CC"){
            m = 12;
        } else if (tipo == "CP"){
            m = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - m);
            System.out.println("Mensalidade paga com sucesso para: " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }  
    
    public ContaBanco(){
        this.setSaldo (0);
        this.status = false;
    }  
    
    public int getNumConta(){
        return numConta;
    }       
    public void setNumConta(int n){
        this.numConta = n;
    }       
    public String getTipo(){
        return tipo;
    }       
    public void setTipo(String t){
        this.tipo = t;
    }       
    public String getDono(){
        return dono;
    }       
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }   
}