<%-- 
    Document   : editinfoP
    Created on : Mar 29, 2022, 8:48:37 AM
    Author     : Kimora Bailey
--%>

<%@page import="Business.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Patient p1 = (Patient)session.getAttribute("p1");
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
        <title>Edit Patient</title>
    </head>
    <body>
        <div class="rectangle">
            <h3> Update Patient Information </h3> 
        
        <form name="PINFO" action="Peditprofile" method="post">
            
            <p>Patient ID</p> <input type="text" readonly="readonly" name="patid" value="<%=p1.getpatId()%>" class="input"/>
            
            <p>Password </p> <input type="password" name="patpass" value="<%=p1.getpasswd()%>" class="input"/>
            
            <p>First Name</p> <input type="text" name="pfn" value="<%=p1.getfirstName()%>" class="input"/>
            
            <p>Last Name</p> <input type="text" name="pln" value="<%=p1.getlastName()%>" class="input"/>
            
            <p>Address</p> <input type="text" name="padd" value="<%=p1.getaddr()%>" class="input"/>
            
            <p>Email</p> <input type="text" name="pem" value="<%=p1.getemail()%>" class="input"/>
            
            <p>Insurance</p> <input type="text" name="pins" value="<%=p1.getinsCo()%>" class="input"/>
            
            <button class="form_button" type="submit">Update</button>
        </form>
        </div>
    </body>
</html>
