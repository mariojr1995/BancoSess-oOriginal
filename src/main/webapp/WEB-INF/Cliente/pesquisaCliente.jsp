<%-- 
    Document   : pesquisa
    Created on : 09/11/2018, 21:50:35
    Author     : mario.agjunior
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Pesquisa Cliente</title>

    </head>

    <body>
<form method="post" action="${pageContext.request.contextPath}/PesquisarClienteServlet">
        <h3>Pesquisa de Cliente</h3>
        <br>
        <div id="pesquisaCliente">
            Nome: <input type="text" id="txtPesqNome" name="txtPesqNome">&nbsp;&nbsp;&nbsp;
            Cpf: <input type="number" id="txtPesqCPF" name="txtPesqCPF"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit">Pesquisar</button><br><br>
            <input type="hidden" id="txtPag" name="txtPag" value = "/WEB-INF/Cliente/resultadoPesqCliente.jsp">
            <table width="400" border="1">
                <tbody>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                    </tr>
                    <tr>
                        <td align=middle></td>
                        <td align=middle></td>
                    </tr>
                </tbody>
            </table><br>
             <button>Editar</button>
             <button type="reset" onclick="window.location.href = 'menu.jsp';">Voltar</button>

        </div>
    </body>
</html>