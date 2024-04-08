<%-- 
    Document   : punchOut
    Created on : 28-Mar-2024, 5:40:40 pm
    Author     : bharat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    #submit{
    position: fixed;
    bottom: 100px; /* Adjust as needed */
    left: 8%; /* Align to center horizontally */
    transform: translateX(-50%);
}
</style>
    <body>
        <form action="punchout" method="post">
            
             <label for="id" style="display: none;">id</label>
<input name="id" type="hidden" value="<%=session.getAttribute("id")%>">
<button id="submit" value="submit">PUNCH OUT</button>
        </form>
    </body>
</html>
