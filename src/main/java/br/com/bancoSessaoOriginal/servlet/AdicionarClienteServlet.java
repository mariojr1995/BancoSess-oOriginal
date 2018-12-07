/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.servlet;

import br.com.bancoSessaoOriginal.dao.ClienteDAO;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.bancoSessaoOriginal.model.Cliente;
/**
 *
 * @author mario.agjunior
 */
import br.com.bancoSessaoOriginal.model.Endereco;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

@WebServlet(name = "AdicionarClienteServlet", urlPatterns = {"/AdicionarClienteServlet"})
public class AdicionarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
//        ClienteDAO idCliente = new ClienteDAO();
//        try {
//            List<Cliente> clientes = idCliente.obterCliente();
//            request.setAttribute("clientes", clientes);
//        } catch (Exception ex) {
//            Logger.getLogger(AdicionarClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        request.setAttribute("nome", "");
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/Cliente/cadastroCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("txtNome");
        String rg = request.getParameter("txtRg");
        String cpf = request.getParameter("txtCpf");
        
        String rua = request.getParameter("txtRua");
        String numero = request.getParameter("txtNum");
        String complemento = request.getParameter("txtComp");
        String bairro = request.getParameter("txtBairro");
        String cidade = request.getParameter("txtCidade");
        String estado = request.getParameter("txtEstado");
      
        
        Endereco endereco = new Endereco(rua, numero, complemento, bairro, cidade, estado);
        Cliente cliente = new Cliente(nome, cpf, rg,endereco);
        ClienteDAO clienteDAO = new ClienteDAO();
        
        try {
            
//            cliente.setEndereco(endereco);
            clienteDAO.cadastrar(cliente);
            request.setAttribute("mensagem", "Conta cadastrada com sucesso");
            
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
 
        
            RequestDispatcher dispatcher 
                    = request.getRequestDispatcher(
                            "/WEB-INF/Cliente/cadastroCliente.jsp");
            dispatcher.forward(request, response);
    }

}
