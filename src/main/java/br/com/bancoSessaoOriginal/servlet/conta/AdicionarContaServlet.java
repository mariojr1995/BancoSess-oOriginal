/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.servlet.conta;

import br.com.bancoSessaoOriginal.dao.ClienteDAO;
import br.com.bancoSessaoOriginal.model.Cliente;
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
    
    

    
}
