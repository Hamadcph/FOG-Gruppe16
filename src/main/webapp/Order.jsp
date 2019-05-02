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
            <p1> Choose length in cm: </p1> 
            <select name="size">
            <%
               
                DataMapper m = new DataMapper();
                for(Carport c : m.getShit())
                {   
            %>
            Choose size: <option value="<%= m.getShit()%>"> <%= c.getLength()%>  </option> 
                
               
            <% }    %>
            </select>
            <p1> Choose width in cm: </p1> 
            <select name="size">
            <%
                for(Carport c : m.getShit())
                {   
            %>
            Choose size: <option value="<%= m.getShit()%>"> <%= c.getWidth()%> </option>  
                
               
            <% }    %>
            </select>
            <p1> Choose a roofstyle: </p1> 
            <select name="style">
            <%
                for(Carport c : m.getShit())
                {   
            %>
            Choose size: <option value="<%= m.getShit()%>"> <%= c.getRoofstyle()%> </option>  
                
               
            <% }    %>
            </select>
        </form>
            
    </body>
</html>
