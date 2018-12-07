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
public abstract class Conta{
    private int numConta;
    private int numAgencia;
    private double saldo;
    private Cliente cliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    private int idCliente;

    
    public Conta(int numConta, int numAgencia, Cliente cliente){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.cliente = cliente;
    }
    public Conta(int numConta, int numAgencia, int idCliente){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.idCliente = idCliente;
    }
    public Conta(){
        
    }
        
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }


}
