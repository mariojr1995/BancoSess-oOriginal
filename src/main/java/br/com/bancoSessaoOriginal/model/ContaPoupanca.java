/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.model;

/**
 *
 * @author mario.agjunior
 */
public class ContaPoupanca extends Conta{
    
    private double taxaRendimento;
    
    public ContaPoupanca(int numConta, int numAgencia, double saldo, Cliente cliente){
        super(numConta, numAgencia, cliente);        
    }
    
}
