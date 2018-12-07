/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoSessaoOriginal.servlet.conta;


import br.com.bancoSessaoOriginal.dao.ContaDAO;
import br.com.bancoSessaoOriginal.model.ContaCorrente;
import java.io.IOException;
import java.util.List;
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
@WebServlet (name = "PesquisarContaServlet", urlPatterns = {"/PesquisarContaServlet"})
public class PesquisarContaServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/Conta/pesquisaConta.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numConta = request.getParameter("txtNumConta");
        String nome = request.getParameter("txtNome");
        

        try {
            List<ContaCorrente> contas;
           ContaDAO contaDAO = new ContaDAO();
            
           if(!numConta.isEmpty())
                contas = contaDAO.obterConta(numConta);
            else
                contas = contaDAO.obterConta(nome);

            
            if(contas.size() > 0)
                request.setAttribute("contas", contas);
            else
                request.setAttribute("mensagem", "Nenhum curso foi localizado");            
//           

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
        
        
        //TODO: Atribuir variavel destination de acordo com o que o jsp (page) enviar
        //ex: destination = tempDestination
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher("/WEB-INF/Cliente/resultadoPesquisaConta.jsp");      
        
        dispatcher.forward(request, response);        
    }
}
