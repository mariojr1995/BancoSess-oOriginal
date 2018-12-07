<%-- 
    Document   : resultadoPesqConta
    Created on : 07/12/2018, 11:47:54
    Author     : mario
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Pesquisa Conta</title>

    </head>

    <body>
        <form method="post" action="${pageContext.request.contextPath}/PesquisarClienteServlet">
            Pesquisa de Conta
            <div id="pesquisaCliente">           
                <table width="400" border="1">
                    <tbody>
                        <tr>
                            <th>Número Conta</th>
                            <th>Saldo</th>
                        </tr>
                        <tr>                        
                            <c:if test="${contas != null}">
                                <c:forEach items="${contas}" var="contas">
                                    <td>${contas.numConta}</td>
                                    <td>${conta.saldo}</td>                            
                                </c:forEach>
                            </c:if>
                        </tr>
                    </tbody>
                </table><br>
            </div>
        </form>
            <form method="post" action="${pageContext.request.contextPath}/DepositoServlet">
                <button>Deposito</button>
            </form>
    </body>
</html>