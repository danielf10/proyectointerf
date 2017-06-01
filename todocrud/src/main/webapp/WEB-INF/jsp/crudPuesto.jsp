<%-- 
    Document   : crudPuesto
    Created on : 1/05/2017, 10:18:37 AM
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
       
        
        <title>CrudPuesto</title>
    
        <body>  
            
    <center>
        <h1>Administrar Puestos</h1>
        <h2>
            <a href="/new">Agregar un nuevo puesto</a>
        </h2>
    </center>
    <div align="center">
        <form action="lista" method="GET">
        <table border="2" cellpadding="20">
            <caption><h2>Puestos</h2></caption>
            <tr>
                <th>Nombre del puesto</th>
                <th>Descripcion</th>
                <th>Horario</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="puesto" items="${listaPuesto}">
                <tr>
                    <td><c:out value="${puesto.nombre}" /></td>
                    <td><c:out value="${puesto.descripcion}" /></td>
                    <td><c:out value="${puesto.horario}" /></td>
                    
                    <td>
                        <a href="/edit?id=<c:out value='${puesto.nombre}' />">Editar Puesto</a>
                        <button id="lol"  method="GET" action="clase1/agregarPuesto"type="button">Click Me!</button> 
                        
                        <a href="/delete?id=<c:out value='${puesto.nombre}' />">Eliminar Puesto</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
        </form>
    </div>       
</body>
</html>
