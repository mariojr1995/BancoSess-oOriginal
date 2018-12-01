package br.com.bancoSessaoOriginal.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mario.agjunior
 */
public interface ITransacao {
    public Double saldo();
    public Double saque();
    public void depositar(double valorDep);
}
