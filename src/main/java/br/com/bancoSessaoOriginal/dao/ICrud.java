/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mario
 * @param <T>
 */
public interface ICrud<T> {
    void excluir(long id) throws SQLException, Exception;
    void cadastrar (T obj) throws SQLException, Exception;
    void atualizar (T obj) throws SQLException, Exception;
}
