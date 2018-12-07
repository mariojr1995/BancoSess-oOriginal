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
            Pesquisa de Clientes
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
        </form>
        <h1>Cadastro de conta</h1>

        <form method="post" action="${pageContext.request.contextPath}/AdicionarContaServlet">
            Número da Conta: <input type="text" name="txtNmrConta" id="txtNmrConta"><br><br>
            Número da Agência: <input type="text" name="txtNmrAgencia" id="txtNmrAgencia"><br><br>
            Saldo: <input type="text" name="txtSaldo" id="txtSaldo"><br><br>
            Id do Cliente: <input type="text" name="txtIdCliente" id="txtIdCliente">
            <br><br>
            <button type="submit">Salvar</button>
            <button type="reset">Resetar</button>
        </form>
        <form method="get" action="${pageContext.request.contextPath}/AlterarCliente">
            <button type="submit" value="${cliente.id}" name="id">Alterar</button>
        </form>
    </body>
</html>