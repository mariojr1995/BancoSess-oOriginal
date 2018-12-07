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
        <title>Cadastro de Cliente</title>
    </head>
    <body>
        <h1> CADASTRAMENTO DO CLIENTE</h1>

        <form method="post" action="${pageContext.request.contextPath}/AdicionarClienteServlet">
            <h5> Dados Pessoais </h5>
            Nome: <input type="text" name="txtNome" id="txtNome"><br><br>
            RG: <input type="text" name="txtRg" id="txtRg"><br><br>
            CPF: <input type="text" name="txtCpf" id="txtCpf"><br><br>			
            <hr>
            <h5 > Endereco Pessoal  </h5>
            Rua: <input type="text" name="txtRua" id="txtRua">&nbsp;&nbsp;&nbsp;&nbsp;Número: <input type="number" name="txtNum" id="txtNum"><br><br>
            Complemento: <input type="text" name="txtComp" id="txtComp">&nbsp;Bairro: <input type="text" name="txtBairro" id="txtBairro"><br><br>
            Cidade: <input type="text" name="txtCidade" id="txtCidade"><br><br>
            Estado: <input type="text" name="txtEstado" id="txtEstado">
            <br>
            <br>
            <button type="submit">Salvar</button>&nbsp;
            <button type="reset" onclick="window.location.href = 'menu.jsp';">Voltar</button>

        </form>
    </body>
</html>
