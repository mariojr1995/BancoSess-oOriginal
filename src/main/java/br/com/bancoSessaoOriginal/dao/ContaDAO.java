/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.dao;

import br.com.bancoSessaoOriginal.model.Conta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mario.agjunior
 */
public class ContaDAO implements ICrud<Conta> {

    public ContaDAO() {

    }

    private static Connection obterConexao() throws ClassNotFoundException, SQLException {
        //
        Connection conn = null;
        // Passo 1: Registar Driver JBDC
        Class.forName("com.mysql.jdbc.Driver");
        // Passo 2: Obter a conexão
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bancosessaooriginal",
                "root",
                "");

        return conn;
    }

    @Override
    public void excluir(long id) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrar(Conta obj) throws SQLException, Exception {
        String sql = "INSERT INTO CONTA (NUMCONTA, NUMAGENCIA, SALDO, IDCLIENTECONTA) VALUES (?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            
            
            
           


            //Executa o comando no banco de dados
            preparedStatement.execute();
            //coleta o ID do cliente gerado

        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public void atualizar(Conta obj) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
