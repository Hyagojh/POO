package Aula07;
public class Aluno extends Pessoa { //caso fosse public final class Aluno e não permitiria que nenhuma outra classe herdasse dela. Uma classe final é apenas folha.
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){ //caso fosse escrito public final, ele seria método final e não poderia ser sobreposto.
        System.out.println("Pagando mensalidade de aluno");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //aluno tem tudo que pessoa tem, e tem acréscimos, ou seja herança pela diferença.
}
