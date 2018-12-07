<%-- 
    Document   : cadastro
    Created on : 09/11/2018, 21:50:14
    Author     : mario.agjunior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Cadastro de Clientes</title>
    </head>
    <body>
        <h1> Cadastro de clientes</h1>

        <form method="post" action="${pageContext.request.contextPath}/AdicionarClienteServlet">
            Nome: <input type="text" name="txtNome" id="txtNome"><br><br>
            RG: <input type="text" name="txtRg" id="txtRg"><br><br>
            CPF: <input type="text" name="txtCpf" id="txtCpf"><br>			

            Rua: <input type="text" name="txtRua" id="txtRua"><br><br>
            Número: <input type="number" name="txtNum" id="txtNum"><br><br>
            Complemento: <input type="text" name="txtComp" id="txtComp"><br><br>
            Bairro: <input type="text" name="txtBairro" id="txtBairro"><br><br>
            Cidade: <input type="text" name="txtCidade" id="txtCidade"><br><br>
            Estado: <input type="text" name="txtEstado" id="txtEstado">
            </div>
            <button type="submit">Salvar</button>
            <button type="reset">Resetar</button>

        </form>
    </body>
</html>
