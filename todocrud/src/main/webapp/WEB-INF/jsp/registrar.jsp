<%-- 
    Document   : Registrar
    Created on : 20/02/2017, 11:08:36 PM
    Author     : Milton Pineda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
         <style type="text/css">
             #lol{
  width: 30%;}
            
            </style>
    </head>
    <body>
    <center>
        <h1>Crear cuenta</h1>
    </center>
        <hr>
        <center>
            <form  id="lol"  method="GET" action="clase1/usuario">
                 
               <h2>Nombre</h2>
               <input name="nombre1" id="usuario" class="form-control"  type="text" placeholder="Nombre completo" required>
                    
               <h2>Correo</h2>
               <input name="correo" id="correo" class="form-control"  type="text" placeholder="Correo electronico" required>
                 
               <h2>Contraseña</h2>
               <input id="contra" name="contrasenia" class="form-control" type="password" placeholder="Contraseña" required>
                
                
                <br>
                
                <button  onclick="myFunction()" class="btn btn-Warning" >Registrar</button>
            </form>
            
            <br><hr>
        </center>
    <script>
        var usuario=document.getElementById("usuario");
        var contrasenia=document.getElementById('contra');
        var correo=document.getElementById('correo');
        if(usuario=="" &&  contrasenia==""&&  correo==""){
            function myFunction{
                alert("campos vacios");
                
            }
        }
        </script>
        <center>Ya tienes una cuenta inicia sesión <a href="registrar.jsp">Aqui</a> </center>
      
        
        <center>Ya tienes una cuenta inicia sesión <a method="post" action="agregarPuesto">Aqui</a> </center>
    </body>
</html>
