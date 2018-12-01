<%-- 
    Document   : pesquisa
    Created on : 09/11/2018, 21:50:35
    Author     : mario.agjunior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Pesquisa Cliente</title>

    </head>

    <body>
        Pesquisa de Clientes
        <div id="pesquisaCliente">
            Nome: <input type="text" id="txtPesqNome">&nbsp;&nbsp;&nbsp;
            Cpf: <input type="number" id="txxPesqCPF"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button value="">Pesquisar</button><br><br>

            <table width="400" border="1">
                <tbody>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                    </tr>
                    <tr>
                        <td>&nbsp;&nbsp;&nbsp;</td>
                        <td>&nbsp;&nbsp;&nbsp;</td>	
                    </tr>
                </tbody>
            </table><br>
            <button>Editar</button>

        </div>
    </body>
</html>
