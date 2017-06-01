<%-- 
    Document   : actualizarPuesto
    Created on : 1/05/2017, 10:17:40 AM
    Author     : Milton Pineda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
         <style type="text/css">
             #agregar{
  width: 30%;}
            
            </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <body>
    <center>
        <h1>Actualizar informacion del puesto</h1>
    </center>
    <div align="center">
       <form action="update" method="post">
        <table border="1" cellpadding="5">
                        
            <tr>
                <th>Nombre: </th>
                <td>
                    <input type="text" name="Descripcion" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Descripcion: </th>
                <td>
                    <input type="text" name="horario" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Horario: </th>
                <td>
                    <input type="text" name="price" size="45"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Actualizar información" />
                </td>
            </tr>
        </table>
        </form>
    </div>   
</body>
</html>
