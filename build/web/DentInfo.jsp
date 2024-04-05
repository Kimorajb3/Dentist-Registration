<%-- 
    Document   : DentInfo
    Created on : Mar 29, 2022, 1:06:29 PM
    Author     : Kimora Bailey
--%>

<%@page import="Business.Dentist"%>
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
                background-image:url('https://www.whatspaper.com/wp-content/uploads/2021/07/hd-aesthetics-wallpaper-whatspaper-1.png');
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
            }
            h2{
                font-size: 30px;
                color: #9dcbff;
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
              background-color: #bb7db2;  
            }
            
            .content{
              height:50px;
              overflow-x:auto;
              margin-top: 0px;
              background-color: #d7cbd4;
              border: 1px solid rgba(255,255,255,0.3);
            }
            
            .apptcontent{
              height:auto;
              overflow-x:auto;
              margin-top: 0px;
              background-color: #d7cbd4;
              border: 1px solid rgba(255,255,255,0.3);  
            }
            
            th{
              padding: 20px 15px;
              text-align: left;
              font-weight: 500;
              font-size: 12px;
              color: #8d1c1a;
              text-transform: uppercase;
            }

            td{
              padding: 15px;
              text-align: left;
              vertical-align:middle;
              font-weight: 300;
              font-size: 12px;
              color: #8d1c1a;
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
              color: #fecdcb;
            }
            a:hover{
              background-color:#8d1c1a;  
            }
            .info{
               width: 100%;
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
        <title>Dentist Info</title>
    </head>
    <body>
        <%
            Dentist d1 = (Dentist)session.getAttribute("d1");
            d1.display();
        %>
        <div class="info">
               <a href="editinfoD.jsp" class = "hyper">Edit Information</a>
        </div>
        
        <div class="rectangle">
            <script src="https://cdn.lordicon.com/lusqsztk.js"></script>
<lord-icon
    src="https://cdn.lordicon.com/zpxybbhl.json"
    trigger="loop"
    colors="primary:#9dcbff,secondary:#bfe2fe"
    style="width:150px;
    height:100px;
    display: block;
    position: absolute;
    top: 40px;
    left: calc(48% - 49px);">
</lord-icon>
        </div>
        
        <h2>Dentist Information </h2>
        <div class="header">
            <table border="0" cellpadding="0" cellspacing="0">
                <thead>
                    <tr>
                        <th>Dentist Name </th>
                        <th>Dentist ID </th>
                        <th>Email </th>
                        <th>Office # </th>
                    </tr>
                </thead>
            </table>
        </div>
        <div class="content">
            <table border="0" cellpadding="0" cellspacing="0">
                <tbody>
                    <tr>
                        <td><%=d1.getfirstName() + " "+ d1.getlastName()%></td>
                        <td><%=d1.getid()%></td>
                        <td><%=d1.getemail()%></td>
                        <td><%=d1.getoffice()%></td>
                    </tr>
                </tbody>
        </table>
        </div>
      
                    <div class="book">
                     <script src="https://cdn.lordicon.com/lusqsztk.js"></script>
<lord-icon
    src="https://cdn.lordicon.com/yalwfksd.json"
    trigger="loop"
    colors="primary:#9dcbff,secondary:#bfe2fe"
    style="width:150px;
    height:100px;
    display: block;
    position: absolute;
    top: 330px;
    left: calc(48% - 50px);">
</lord-icon>   
                        
                    </div>
                    
                    <h2>Appointment Information</h2>
                    <div class="header">
        <table border="0" cellpadding="0" cellspacing="0">
            <thead>
                <tr>
                    <th>Appointment Date</th>
                    <th>Patient ID</th>
                    <th>ProcCode</th>
                </tr>
            </thead>
        </table>
                    </div>
                    <div class="apptcontent">
                        <table border="0" cellpadding="0" cellspacing="0">
                            <tbody>                        
            <%for (int i = 0; i < d1.apptList.count; i++) {
              out.println("<tr><td>"+d1.apptList.apptList[i].getADT()+"</td><td>" 
              +d1.apptList.apptList[i].getpatId()+"</td><td>"+
             d1.apptList.apptList[i].getproccode()+ "</td></tr>");               
                        %><%  }%>       
                            </tbody>
            </table>
                    </div>
    </body>
</html>
