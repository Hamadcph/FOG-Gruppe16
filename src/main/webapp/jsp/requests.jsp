<%@page import="java.util.List"%>
<%@page import="Data.Request"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% List<Request> requests = (List) request.getAttribute("requests");%>
<!DOCTYPE html>
<html>
    <head></head>
    <body>
        
    </body>
    <table>
    <%for(Request r : requests){%>
    <tr>
        <td style="border-bottom: 1px solid #000; padding-bottom: 10px;">
            Ordrenummer: <%= r.getId() %><br>
            Kunde: <%= r.getAddress().getFirstname() + " " + r.getAddress().getLastname() %><br>
            Leveringsoplysninger:<br>
            <%= r.getAddress().getStreet() %><br>
            <%= r.getAddress().getZip()%>, <%= r.getAddress().getCity()%><br>


            <div style="padding: 5px; border: 1px solid #000;">
                <b>Carport</b><br>
                Bredde: <%= r.getCarport().getWidth() %>
                Længde: <%= r.getCarport().getLength() %>
                Tagtype: <%= r.getCarport().getRooftype() %>
                Hældning: <%= r.getCarport().getInclination() %>
            </div><br>

            <div style="padding: 5px; border: 1px solid #000;">
                <b>Materialer</b><br>
                Skruer: <%= r.getList().getScrewAmount() %>
                Træ: <%= r.getList().getWoodAmount() %>
                Sten: <%= r.getList().getBracketAmount() %>
            </div>
        </td>
    </tr>
    
    <%}%>
    </table>
</html>
