<%-- 
    Document   : cerrarSesion
    Created on : 7/09/2021, 03:10:08 PM
    Author     : Joan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%
    HttpSession objSesion= request.getSession();
    objSesion.invalidate();
    out.print("<script>location.replace('../index.html');</scrpit>");
 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
    </body>
</html>
