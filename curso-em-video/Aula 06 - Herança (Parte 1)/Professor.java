package Aula06;
public class Professor extends Pessoa {
    
    private String especialdiade;
    private float salario;
    
    public void receberAument(float aumento){
        salario += aumento;
        System.out.println("Salário foi acrescido de " + aumento + "reais");
    }

    public String getEspecialdiade() {
        return especialdiade;
    }

    public void setEspecialdiade(String especialdiade) {
        this.especialdiade = especialdiade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
