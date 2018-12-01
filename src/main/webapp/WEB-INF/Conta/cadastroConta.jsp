<%-- 
    Document   : cadastrp
    Created on : 09/11/2018, 21:51:28
    Author     : mario.agjunior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Cadastro de Conta</title>

    </head>

    <body>
        Cadastro de conta
        <div name="dadosPessoais" id="dadosPessoais"><br>
            <fieldset><legend>Pesquisa Cliente</legend>

                <form name=frmDadosPessoais>
                    Nome: <input type="text" name="txtNome" id="txtId"><br><br>
                    RG: <input type="text" name="txtRg" id="txtId"><br><br>
                    CPF: <input type="text" name="txtCpf" id="txtId">			
                </form>
            </fieldset>		
        <button type="submit">Pesquisar</button>
        <button type="reset">Resetar</button>
    </body>
</html>