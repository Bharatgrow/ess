<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Date" %>
<%@page import="java.time.LocalTime"%>
<%@page import="mvc.Controller.login"%>
<%@page isELIgnored="false" %>
<%LocalTime lt=LocalTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = lt.format(formatter);%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Vertical Split Layout</title>
<style>
    /* Container styling */
    .container {
        display: flex; /* Use flexbox */
        height: 100vh; /* Full viewport height */
    }

    /* Left column styling */
    .left-column {
        flex: 1; /* Take up remaining space */
        background-color: #f0f0f0; /* Light gray background */
        padding: 20px; /* Add some padding */
    }

    /* Right column styling */
    .right-column {
        flex: 5; /* Take up remaining space */
        background-color: #e0e0e0; /* Lighter gray background */
        padding: 20px; /* Add some padding */
    }
</style>
</head>
<body>
    
<div class="container">
    <div class="left-column">
        
        <h2>Left Column</h2> <a href="delete">this delete</a>
        <a href="update">update</a>
        <a href="index">Register</a><br>
        <a href="attendance">Daily Attendance</a>
        <p><%=session.getAttribute("id")%></p>
         <p><%=session.getAttribute("name")%></p>
                  <p><%=session.getAttribute("image")%></p>

          
        
            <p>${time}</p>
            
            <%@include file="Attendance.jsp" %>
            <br>
            <%@include file="punchOut.jsp" %>

          
    </div>
    <div class="right-column">
        <%@include file="calendar.jsp" %>
         </div>
</div>
            
       
            
           
</body>
</html>
