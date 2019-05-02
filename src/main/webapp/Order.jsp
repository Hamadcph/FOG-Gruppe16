<%-- 
    Document   : Order
    Created on : 01-05-2019, 13:44:48
    Author     : shpattt
--%>

<%@page import="DataLayer.Carport"%>
<%@page import="Mapper.DataMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="order">
        <h1>Order a carport!</h1>
        <div class="master">
          
        
        <form action ="WelcomeServlet" method="get">
            <p1> View topping selection: </p1> 
            <select name="topping">
            <%
               
                DataMapper m = new DataMapper();
                for(Carport c : m.getShit())
                {   
            %>
            View topping: <option value="<%= m.getShit()%>"> <%= c.getLength()%>  </option>
                
               
            <% }    %>
            </select>
        </form>
            
    </body>
</html>
