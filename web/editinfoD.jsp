<%-- 
    Document   : editinfoD
    Created on : Mar 29, 2022, 7:24:06 PM
    Author     : Kimora Bailey
--%>

<%@page import="Business.Dentist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Dentist d1 = (Dentist)session.getAttribute("d1");
         %>
        <style>
            *{
                font-family: 'Oswald', sans-serif;
                
            }
            body{
                margin: 0;
                padding: 0;
                background-image: url('https://www.teahub.io/photos/full/128-1281825_download-this-wallpaper-pink-aesthetic-desktop-backgrounds.jpg');
                background-size: cover;
                background-position: center;
                height: 100%;
            }
            .rectangle{
                width: 320px;
                height: 760px;
                background: #F4D19B;
                color: #FD5D5D;
                top: 50%;
                left: 50%;
                position: absolute;
                transform: translate(-50%, -50%);
                box-sizing: border-box;
                padding: 50px 40px;
                
            }
            h1{
                margin: 0;
                padding: 0 0 20px;
                text-align: center;
                font-size: 22px;
            }
            p{
               margin: 0;
               padding: 0;
               font-weight: bold;               
            }
            .input{ 
              width: 100%;
              margin-bottom: 20px;
              border: none;
              border-bottom: 1px solid #fff;
              background: transparent;
              outline: none;
              height: 40px;
              color: #FD5D5D;
              font-size: 16px;
            }
            .form_button{
                width: 100%;
                padding: 0px;
                font-size: 1.1rem;               
                cursor: pointer;
                border: none;
                outline: none;
                height: 40px;
                background: #FD5D5D;
                color: #FFBED8;    
            }
           
           </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Dentist</title>
    </head>
    <body>
        <div class="rectangle">
            <h3> Update Dentist Information </h3> 
        
        <form name="DINFO" action="Deditprofile" method="post">
            
            <p>Dentist ID</p> <input type="text" readonly="readonly" name="dentid" value="<%=d1.getid()%>" class="input"/>
            
            <p>Password </p> <input type="password" name="dentpass" value="<%=d1.getpasswd()%>" class="input"/>
            
            <p>First Name</p> <input type="text" name="dfn" value="<%=d1.getfirstName()%>" class="input"/>
            
            <p>Last Name</p> <input type="text" name="dln" value="<%=d1.getlastName()%>" class="input"/>
            
            <p>Email</p> <input type="text" name="dem" value="<%=d1.getemail()%>" class="input"/>
            
            <p>Office</p> <input type="text" name="doff" value="<%=d1.getoffice()%>" class="input"/>
            
            <button class="form_button" type="submit">Update</button>
        </form>
        </div>
    </body>
</html>