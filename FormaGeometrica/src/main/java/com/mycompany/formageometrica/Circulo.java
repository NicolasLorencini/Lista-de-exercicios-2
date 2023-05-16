
package com.mycompany.formageometrica;

/**
 *
 * @author aluno
 */
public class Circulo extends FormaGeometrica {
    
    public double raio;
    public int area;
    
    
     @Override
    public void calcularArea() {
        super.calcularArea();
        
        area = (int) ((3.14 * 3.14) * raio);
}
}
