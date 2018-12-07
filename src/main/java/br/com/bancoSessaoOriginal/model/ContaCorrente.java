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
public class ContaCorrente extends Conta{

    
    public ContaCorrente(int numConta, int numAgencia, Cliente cliente){
        super(numConta, numAgencia, cliente);
    }
    
    public ContaCorrente(int numConta, int numAgencia, int idCliente){
        super( numConta, numAgencia, idCliente);
    }
    public ContaCorrente() {
        
    }

    
}
