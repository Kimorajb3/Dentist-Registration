<%-- 
    Document   : PatInfo
    Created on : Mar 25, 2022, 11:35:26 PM
    Author     : Kimora Bailey
--%>

<%@page import="Business.Procedures"%>
<%@page import="Business.Appointments"%>
<%@page import="Business.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Oswald&display=swap" rel="stylesheet">
        <style>
            *{
                font-family: 'Oswald', sans-serif;
                
            }
            
            body{
                margin: 0;
                padding: 0;
                background-image: url('https://i.pinimg.com/originals/fd/00/98/fd00984025b813f8da694ca720b39111.jpg');
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;                
            }
            
            h2{
                font-size: 30px;
                color: #202020;
                text-transform: uppercase;
                font-weight: 300;
                text-align: center;
                margin-bottom: 15px;
            }
            table{
                width: 100%;
                table-layout: fixed;
            }
            
            .header{
              background-color: #f6d2ac;  
            }
            
            .content{
              height:50px;
              overflow-x:auto;
              margin-top: 0px;
              background-color: #e6ae74;
              border: 1px solid rgba(255,255,255,0.3);  
            }
            
            th{
              padding: 20px 15px;
              text-align: left;
              font-weight: 500;
              font-size: 12px;
              color: #202020;
              text-transform: uppercase;
            }

            td{
              padding: 15px;
              text-align: left;
              vertical-align:middle;
              font-weight: 300;
              font-size: 12px;
              color: #202020;
              border-bottom: solid 1px rgba(255,255,255,0.1);
            }
            .rectangle{
                width: 20px;
                height: 90px;
                background: transparent;
                background-position: center;
                background-repeat: no-repeat;
            }
            
            .book{
                width: 20px;
                height: 100px;
                background: transparent;
                background-position: center;
                background-repeat: no-repeat;
            }
            
            a{
              text-decoration: none;
              font-size: 16px;
              line-height: 20px;
              color: #202020;
            }
            a:hover{
              background-color:#dbdad6;  
            }
            .info{
               width: 100%;
               height: 100%;
               display: flex;
               flex-direction: row;
               justify-content: center;
               text-align:center;  
            }
            .hyper{
                width: 100px;
            }

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Info</title>
    </head>
    <body>
        <%
            Patient p1 =(Patient)session.getAttribute("p1");
            Appointments a1 = (Appointments)session.getAttribute("a1");
            Procedures pr = (Procedures)session.getAttribute("pr");
        %>
        <div class="info">
               <a href="editinfoP.jsp" class = "hyper">Edit Information</a>
            
            <% if(a1.getADT().equals("")){%>
            <a href="schedule.jsp" class ="hyper">Schedule Appointment!</a> 
        <%  }%>
        </div>
        
        <div class="rectangle">
            <script src="https://cdn.lordicon.com/lusqsztk.js"></script>
<lord-icon
    src="https://cdn.lordicon.com/dxjqoygy.json"
    trigger="loop"
    colors="primary:#d73d6c,secondary:#d57276"
    style="width:150px;
    height:100px;
    display: block;
    position: absolute;
    top: 40px;
    left: calc(48% - 49px);">
</lord-icon>
        </div>
        
            <h2>Patient Information</h2>
            <div class="header">
                <table border="0" cellpadding="0" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Patient Name</th>
                            <th>Patient ID</th>
                            <th>Address</th>
                            <th>Email</th>
                            <th>Insurance</th>
                        </tr>
                    </thead>
                </table>
            </div>
            <div class="content">
                <table border="0" cellpadding="0" cellspacing="0">
                    <tbody>
                        <tr>
                          <td><%=p1.getfirstName() + " "+ p1.getlastName()%></td>  
                          <td><%=p1.getpatId()%></td>
                          <td><%=p1.getaddr()%></td>
                          <td><%=p1.getemail()%></td>
                          <td><%=p1.getinsCo()%></td>
                        </tr>
                    </tbody>
                </table>
            </div>
      
        
     <div class="book">
        <script src="https://cdn.lordicon.com/lusqsztk.js"></script> 
<lord-icon
    src="https://cdn.lordicon.com/wxnxiano.json"
    trigger="loop"
     colors="primary:#d57276,secondary:#d73d6c"
    style="width:150px;
    height:100px;
    display: block;
    position: absolute;
    top: 330px;
    left: calc(48% - 50px);">
</lord-icon>
        </div>
                        
            <h2> Appointment Information </h2>
            <div class="header">
                <table border="0" cellpadding="0" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Appointment Time</th>
                            <th>Dentist ID </th>
                            <th>Procedure Code </th>
                            <th>Procedure Description </th>
                        </tr>
                    </thead>
                </table>
            </div>
            <div class="content">
                <table border="0" cellpadding="0" cellspacing="0">
                    <tbody>
                        <tr>
                          <td><%=a1.getADT()%></td>
                          <td><%=a1.getdentId()%></td>
                          <td><%=a1.getproccode()%></td>
                          <td><%=pr.getprdesc()%></td>
                        </tr>
                    </tbody>
            </table>
        </div>
         
        </body>
</html>
