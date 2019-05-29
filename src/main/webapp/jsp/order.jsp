<%-- 
    Document   : Order
    Created on : 01-05-2019, 13:44:48
    
--%>

<%@page import="Data.Carport"%>
<%@page import="Data.Mappers.CarportMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <%
            if(request.getSession().getAttribute("customer")==null)
            {
              response.sendRedirect("/FOG/index.jsp");
            }           
    
                 
  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         Logged in as: ${email}
        <h1>Order a carport!</h1>
        <div class="master">
        <form name="order" action ="/FOG/FrontController" method="POST">
                            <div class="form-group">
                    <label>Vælge længden:</label>
                    <select name="Length" required>                        
                        <option  value="3">3 m</option>
                        <option  value="4">4 m</option>
                        <option value="5">5 m</option>
                        <option value="6">6 m</option>
                        <option value="7">7 m</option>
                    </select>
                    <br>
                    <label>Vælge Bredden:</label>
                    <select name="Width" required>                        
                        <option value="2">2 m</option>
                        <option  value="3">3 m</option>
                        <option value="4">4 m</option>
                        <option value="5">5 m</option>

                    </select>
                    <br>
                    <label >Vælge Roof:</label>
                    <select name="Roofstyle" required>                        
                        <option value="Roofstyle">roof</option>
                    </select>
                    <br>
                        <label>Vælge Inclined: </label>
                    <select name="Inclined" required>                        
                        <option value="25">45 grader</option>
                        <option value="35">35 grader</option>
                        
                    </select>
                    <br>
                    <br>
                    <input type="text" name="firstname" placeholder="Fornavn">
                    <input type="text" name="lastname" placeholder="Efternavn">
                    <input type="text" name="street" placeholder="Gade">
                    <input type="number" name="zip" placeholder="Postnummer">
                    <input type="text" name="city" placeholder="By">
                    <input type="hidden" name="command" value="order">

                    <div>        
                        <div>
                            <button type="submit">Send order</button>
                        </div>
                    </div>
        
                    


                </div>
            </form>
            
            
    </body>
</html>
