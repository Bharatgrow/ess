<%-- 
    Document   : Attendance
    Created on : 21-Mar-2024, 3:46:52 pm
    Author     : bharat
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head><style>
    #submitButton {
    position: fixed;
    bottom: 150px; /* Adjust as needed */
    left: 8%; /* Align to center horizontally */
    transform: translateX(-50%);
}
</style>
    <body>
       
        <form action="attendance" method="post">
            
            
            <label for="id" style="display: none;">id</label>
<input name="id" type="hidden" value="<%=session.getAttribute("id")%>">
<button id="submitButton" value="submit">PUNCH IN</button>
        </form>
        
        
    </body>
</html>
