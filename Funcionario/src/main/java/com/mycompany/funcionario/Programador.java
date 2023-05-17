
package com.mycompany.funcionario;

/**
 *
 * @author aluno
 */
public class Programador extends Funcionario {

    public Programador(String linguagem, String nome, double salario) {
        super(nome, salario);
        this.linguagem = linguagem;
    }
    
    
    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    
    
}
