<%-- 
    Document   : Order
    Created on : 01-05-2019, 13:44:48
    Author     : shpattt
--%>

<%@page import="Data.Carport"%>
<%@page import="Data.Mappers.CarportMapper"%>
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
        <form action ="CreateCarport" method="POST">
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
                    <select name="RoofStyle" required>                        
                        <option value="RoofStyle">roof</option>

                    </select>
                    <br>
                    <br>
                    <div >
                        <label for="name"> First Name:</label>
                        <div >
                            <input type="text" id="name" name="name" required>
                        </div>
                    </div>
                    <br>
                    <br>
                    <div>
                        <label for="lastname"> Last Name:</label>
                        <div>
                            <input type="text" class="form-control" id="lastname" name="lastname" required>
                        </div>
                    </div>
                    <br>
                    <br> 
                    <div >
                        <label for="adress"> Adress:</label>
                        <div >
                            <input type="text" id="adress" name="adress" required>
                        </div>
                    </div>
                    <br>
                    <br>
                    <div>
                        <label for="phonenumber"> Phone:</label>
                        <div>
                            <input type="text"id="phonenumber"  name="phonenumber" required>
                        </div>
                    </div>
                    <br>
                    <br> 
                    <div>
                        <label for="Email"> Email:</label>
                        <div>
                            <input type="text" id="Email"  name="Email" required>
                        </div>
                    </div>
                    <br>
                    <br>        
                    <div>        
                        <div>
                            <button type="submit">Send order</button>
                        </div>
                    </div>


                </div>
            
            
    </body>
</html>
