/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucontabancaria;

/**
 *
 * @author aluno
 */
public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo, String titular) {
        super(saldo, titular);
    }

  public void calcCheque(){
      int valorCheque = 120;
        double chequeEspecial = saldo - valorCheque;
  }

    

    
   
}
