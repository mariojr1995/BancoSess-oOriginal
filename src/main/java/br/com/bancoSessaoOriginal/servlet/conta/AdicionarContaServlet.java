/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.servlet.conta;

import br.com.bancoSessaoOriginal.dao.ClienteDAO;
import br.com.bancoSessaoOriginal.dao.ContaDAO;
import br.com.bancoSessaoOriginal.model.Cliente;
import br.com.bancoSessaoOriginal.model.Conta;
import br.com.bancoSessaoOriginal.model.ContaCorrente;
import br.com.bancoSessaoOriginal.servlet.AdicionarClienteServlet;
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
 * @author mario
 */
@WebServlet(name = "AdicionarContaServlet", urlPatterns = {"/AdicionarContaServlet"})
public class AdicionarContaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/Conta/cadastroConta.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        int numConta = Integer.parseInt(request.getParameter("txtNumConta"));
        int numAgencia = Integer.parseInt(request.getParameter("txtNumAgencia"));
        int idCliente = Integer.parseInt(request.getParameter("txtIdCliente"));

        Conta conta = new ContaCorrente(numConta, numAgencia, idCliente);
        
        try {
                       
            ContaDAO contaDAO = new ContaDAO();
            contaDAO.cadastrar(conta);
            request.setAttribute("mensagem", "Conta cadastrada com sucesso");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/Conta/cadastroConta.jsp");
        dispatcher.forward(request, response);

    }

}
