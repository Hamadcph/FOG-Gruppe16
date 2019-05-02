<%-- 
    Document   : OrderWithInc
    Created on : 02-05-2019, 13:47:30
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
            Choose size: <option value="<%= m.getShit()%>"> <%= c.getLength()+ "cm"%>  </option> 
                
               
            <% }    %>
            </select>
            <p1> Choose width in cm: </p1> 
            <select name="size">
            <%
                for(Carport c : m.getShit())
                {   
            %>
            Choose size: <option value="<%= m.getShit()%>"> <%= c.getWidth()+ "cm"%> </option>  
                
               
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
            <p1> Choose how much you would like the roof to incline: </p1> 
            <select name="style">
            <%
                for(Carport c : m.getShit())
                {   
            %>
            Choose size: <option value="<%= m.getShit()%>"> <%= c.getInc()+ "°"%> </option> 
                
               
            <% }    %>
            </select>
         </div>
        </form>
            
    </body>
</html>
