/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.dao;

import br.com.bancoSessaoOriginal.model.Conta;
import br.com.bancoSessaoOriginal.model.ContaCorrente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mario.agjunior
 */
public class ContaDAO implements ICrud<Conta>, ITransacao {

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
    public void cadastrar(Conta conta) throws SQLException, Exception {
        String sql = "INSERT INTO CONTA (NUMCONTA, NUMAGENCIA, IDCLIENTECONTA) VALUES (?, ?, ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = obterConexao();            
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, conta.getNumConta());
            preparedStatement.setInt(2, conta.getNumAgencia());
            preparedStatement.setInt(3, conta.getIdCliente());                    
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
    
    public List<ContaCorrente> obterConta(String consulta)throws SQLException, Exception{
        String sql = "SELECT * FROM CONTA WHERE numConta=? or id=?";
        
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, consulta);
            preparedStatement.setString(2, consulta);
                        //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
            
            //Verifica se há pelo menos um resultado
            while (result.next()) {
                //Cria uma instância de Produto e popula com os valores do BD
                
                ContaCorrente conta = new ContaCorrente();
                conta.setNumConta(result.getInt("numConta"));  
                conta.setSaldo(result.getDouble("saldo"));
                contas.add(conta);

            }
            
            return contas;
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
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

    @Override
    public Double saldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double saque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void depositar(double valorDep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
