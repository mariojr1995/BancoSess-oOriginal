<%-- 
    Document   : cadastrp
    Created on : 09/11/2018, 21:51:28
    Author     : mario.agjunior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Cadastro de Conta</title>

    </head>

    <body>

        <form method="post" action="${pageContext.request.contextPath}/PesquisarClienteServlet">
            
            <h3>Autenticacão do Cliente</h3>
            <br>
            <div id="pesquisaCliente">           
                Nome: <input type="text" id="txtPesqNome" name="txtPesqNome">&nbsp;&nbsp;&nbsp;
                Cpf: <input type="number" id="txtPesqCPF" name="txtPesqCPF"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit">Pesquisar</button><br><br>
                <input type="hidden" id="txtPag" name="txtPag" value = "/WEB-INF/Conta/cadastroConta.jsp">
                <table width="400" border="1">
                    <tbody>
                        <tr>
                            <th>ID</th>
                            <th>Nome</th>
                        </tr>
                        <tr>                        
                            <c:if test="${clientes != null}">
                                <c:forEach items="${clientes}" var="clientes">
                                    <td>${clientes.id}</td>
                                    <td>${clientes.nome}</td>                            
                                </c:forEach>
                            </c:if>
                        </tr>
                    </tbody>
                </table><br>

                <button>Pesquisar</button>

            </div>
            <hr>
        </form>
        <h1>Dados da conta : Cadastro</h1>
        <c:if test="${not empty mensagem}">
            <div class="alert alert-info text-center" role="alert">
                <c:out value="${mensagem}" />
            </div>
        </c:if>
        <form method="post" action="${pageContext.request.contextPath}/AdicionarContaServlet">
            <div id="cadastroConta">
                Número da Conta: <input type="text" name="txtNumConta" id="txtNumConta"><br><br>
                Número da Agência: <input type="text" name="txtNumAgencia" id="txtNumAgencia"><br><br>
                Saldo: <input type="text" name="txtSaldo" id="txtSaldo"><br><br>
                Id do Cliente: <input type="text" name="txtIdCliente" id="txtIdCliente">
                <br><br>    

                <button>Salvar</button>&nbsp;
                <button type="reset" onclick="window.location.href = 'menu.jsp';">Voltar</button>
                 <br>
            </div>
            <br>
        </form>
        <form method="get" action="${pageContext.request.contextPath}/AlterarCliente">
            <button type="submit" value="${cliente.id}" name="id">Alterar</button>
        </form>

    </body>
</html>
