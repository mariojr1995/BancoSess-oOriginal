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
            Pesquisa de Clientes
            <div id="pesquisaCliente">           
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
                <button>Editar</button>

            </div>
    </body>
</html>