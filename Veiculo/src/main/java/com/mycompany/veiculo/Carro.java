
package com.mycompany.veiculo;

/**
 *
 * @author aluno
 */
public class Carro extends Veiculo{
    private String cor;

    public Carro(String cor, String marca, int ano) {
        super(marca, ano);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
