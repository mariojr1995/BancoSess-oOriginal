<%-- 
    Document   : pesquisa
    Created on : 09/11/2018, 21:51:48
    Author     : mario.agjunior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Pesquisa Conta</title>

    </head>

    <body>
        <form method="post" action="${pageContext.request.contextPath}/PesquisarContaServlet">
        Pesquisa de Clientes
        <div id="pesquisaCliente">
            Número da Conta: <input type="text" id="txtPesqNome" name="txtPesqNome">&nbsp;&nbsp;&nbsp;
           <button type="submit">Pesquisar</button><br><br>
            <input type="hidden" id="txtPag" name="txtPag" value = "/WEB-INF/Cliente/resultadoPesqConta.jsp">
            <table width="400" border="1">
                <tbody>
                    <tr>
                        <th>Número Conta</th>
                        <th>Nome</th>
                    </tr>
                    <tr>
                        <td align=middle></td>
                        <td align=middle></td>
                    </tr>
                </tbody>
            </table><br>
            <button>Editar</button>

        </div>
    </body>
</html>
