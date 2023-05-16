
package com.mycompany.formageometrica;

/**
 *
 * @author aluno
 */
public class Retangulo extends FormaGeometrica {

    public int base;
    public int altura;
    public int area;
    
    @Override
    public void calcularArea() {
        super.calcularArea();       
        
        area = base * altura;
    }
  
}
