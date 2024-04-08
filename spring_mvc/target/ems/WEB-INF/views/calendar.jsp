<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Vertical Split Layout with Calendar</title>
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

    /* Calendar styling */
    .calendar {
        border-collapse: collapse;
        width: 100%;
    }

    .calendar th, .calendar td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: center;
    }

    .calendar th {
        background-color: #f2f2f2;
    }

    .calendar td {
        cursor: pointer;
    }

    .calendar td:hover {
        background-color: #f0f0f0;
    }
</style>
</head>
<body>

<div class="container">
   
    <div class="right-column">
        <table class="calendar">
            <caption>March 2024</caption>
            <thead>
                <tr>
                    <th>Sun</th>
                    <th>Mon</th>
                    <th>Tue</th>
                    <th>Wed</th>
                    <th>Thu</th>
                    <th>Fri</th>
                    <th>Sat</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td></td>        
                    <td></td>
                    <td></td>
                    <td>1</td>
                    <td>2</td>
                    <td>3</td>
                    <td>4</td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>6</td>
                    <td>7</td>
                    <td>8</td>
                    <td>9</td>
                    <td>10</td>
                    <td>11</td>
                </tr>
             
                <!-- Add more rows for other weeks in the month -->
            </tbody>
        </table>
        <%=session.getAttribute("id")%>
            <    

    </div>
</div>

</body>
</html>
