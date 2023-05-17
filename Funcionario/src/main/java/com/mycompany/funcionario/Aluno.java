package com.mycompany.funcionario;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(int matricula, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.matricula = matricula;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
