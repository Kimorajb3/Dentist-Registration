<%-- 
    Document   : DErrorPage
    Created on : Mar 29, 2022, 2:12:37 PM
    Author     : Kimora Bailey
--%>

<%@page import="Business.Dentist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background: #FA3F3F;
            }
            h1{
                color: #fff;
                text-align:center;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <%
            Dentist d1;
            d1 = (Dentist)session.getAttribute("d1");
            d1.display();
            %>
            <h1>Error!</h1><br>
            <script src="https://cdn.lordicon.com/lusqsztk.js"></script>
<lord-icon
    src="https://cdn.lordicon.com/hrqwmuhr.json"
    trigger="loop"
    colors="primary:#ffffff,secondary:#c71f16"
    style="width:250px;
    height: 250px;
    display: block;
    margin-left: auto;
    margin-right: auto;">
</lord-icon>
            <h1><%=d1.getid()%>, invalid login</h1>
        
    </body>
</html>

