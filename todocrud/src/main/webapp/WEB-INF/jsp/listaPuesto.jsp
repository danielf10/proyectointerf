<%-- 
    Document   : listaPuesto
    Created on : 25-may-2017, 14:46:31
    Author     : Daniel
--%>

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
            <p>hola ke hace </p>
            <c:forEach var="puesto" items="${ps}">
                
                <p>${puesto.idpuesto}</p> 
                 <p>${puesto.cordenada_x}</p> 
                  <p>${puesto.cordenada_y}</p>
                <p> ${puesto.descripcion}</p> 
                <p>${puesto.horario}</h1>   
                <p>p</p>
                    
                    
                    
               
            </c:forEach>
        
        
           
</body>
</html>
