
package com.mycompany.funcionario;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario {

        private double bonus;

    public Gerente(double bonus, String nome, double salario) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
        
        
}
