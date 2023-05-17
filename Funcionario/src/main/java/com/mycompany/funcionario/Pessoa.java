
package com.mycompany.funcionario;


public class Pessoa extends Funcionario{
    
private String nome;
private int idade;

    public Pessoa(String nome, int idade, double salario) {
        super(nome, salario);
        this.nome = nome;
        this.idade = idade;
    }

@Override
    public String getNome() {
        return nome;
    }

@Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
  

}
