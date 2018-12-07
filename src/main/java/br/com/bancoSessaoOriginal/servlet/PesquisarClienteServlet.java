/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.servlet;

import br.com.bancoSessaoOriginal.dao.ClienteDAO;
import br.com.bancoSessaoOriginal.model.Cliente;
import br.com.bancoSessaoOriginal.model.Endereco;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mario.agjunior
 */
@WebServlet(name = "PesquisarClienteServlet", urlPatterns = {"/PesquisarClienteServlet"})
public class PesquisarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        ClienteDAO idCliente = new ClienteDAO();
        try {
            List<Cliente> clientes = idCliente.obterCliente();
            request.setAttribute("clientes", clientes);
        } catch (Exception ex) {
            Logger.getLogger(AdicionarClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("nome", "");

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/Cliente/pesquisaCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("txtPesqNome");
        String cpf = request.getParameter("txtPesqCPF");
        String tempDestination = request.getParameter("txtPag");

        try {
            List<Cliente> clientes;
            ClienteDAO clienteDAO = new ClienteDAO();
            
           if(!nome.isEmpty())
                clientes = clienteDAO.obterClienteNome(nome);
            else
                clientes = clienteDAO.obterClienteNome(cpf);

            
            if(clientes.size() > 0)
                request.setAttribute("clientes", clientes);
            else
                request.setAttribute("mensagem", "Nenhum curso foi localizado");            
//           

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
        
        String destination = tempDestination;
        //TODO: Atribuir variavel destination de acordo com o que o jsp (page) enviar
        //ex: destination = tempDestination
        RequestDispatcher dispatcher = null;
        if(destination.equals("/WEB-INF/Cliente/resultadoPesqCliente.jsp"))
        {
            
            dispatcher = getServletContext().getRequestDispatcher(destination);
        }
        else if(destination.equals("/WEB-INF/Conta/cadastroConta.jsp"))
        {
            
            dispatcher = getServletContext().getRequestDispatcher(destination);
        }
        
        dispatcher.forward(request, response);
        
        //TODO: Enviar de acordo com as JSPs
        
        
//        RequestDispatcher dispatcher
//                = request.getRequestDispatcher(
//                        "/WEB-INF/Cliente/resultadoPesqCliente.jsp");
//        
//        RequestDispatcher dispacDispatcher = 
//                request.getRequestDispatcher("/WEB-INF/Conta/cadastroConta.jsp");
//        
//        
//        
//        dispacDispatcher.forward(request, response);
//        dispatcher.forward(request, response);
    }

}
