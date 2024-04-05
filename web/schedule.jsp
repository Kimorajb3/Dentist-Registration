<%-- 
    Document   : schedule
    Created on : Mar 29, 2022, 9:44:42 AM
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
                background-image: url('https://cdn.mwallpapers.com/photos/wallpapers/3d-abstract/aesthetic-blue-computerhd-wallpapers-desktop-background-android-iphone-1080p-4k-8r46r.jpg');
                background-size: cover;
                background-position: center;
                
            }
            .rectangle{
                width: 320px;
                height: 650px;
                background: #0177D9;
                color: #000F52;
                top: 50%;
                left: 50%;
                position: absolute;
                transform: translate(-50%, -50%);
                box-sizing: border-box;  
                padding: 20px 40px;
                
            }
            h1{
                margin: 0;
                padding: 0 0 20px;
                text-align: center;
                font-size: 22px;
            }
            p{
               margin-bottom: 5px;
               padding: 0;
               font-weight: bold;               
            }
            select{
                background-color: #D4E6F1;
                border: none;
                padding: 0 1em 1em 0;
                margin: 0;
                width: 100%;
                font-size: inherit;
                cursor: inherit;
                line-height: inherit;
            }
            .input{ 
              width: 100%;
              margin: 0px;
              border: none;
              background: #D4E6F1;
              outline: none;
              height: 30px;
              color: black;
              font-size: 16px;
            }
            .form_button{
                width: 100%;
                margin-top: 10px;
                padding: 0px;
                font-size: 1.1rem;               
                cursor: pointer;
                border: none;
                outline: none;
                height: 40px;
                background: #67D3F3;
                color: #fff;    
            }
           
           </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Schedule Appt</title>
    </head>
    <body>
        <div class="rectangle">
            <h3> Hello <%=p1.getfirstName()+" "+p1.getlastName()%> </h3> 
        
        <form name="PSCHEDULE" action="ScheduleServ" method="post">
            <div>
            <p>Month</p>
            <select name="Mon">
                <option value="Jan">January</option>
                <option value="Feb">February</option>
                <option value="Mar">March</option>
                <option value="Apr">April</option>
                <option value="May">May</option>
                <option value="Jun">June</option>
                <option value="Jul">July</option>
                <option value="Aug">August</option>
                <option value="Sep">September</option>
                <option value="Oct">October</option>
                <option value="Nov">November</option>
                <option value="Dec">December</option>
            </select>
            </div>
            <p>Day</p>
            <select name="Day">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="31">31</option>
            </select>
            
            <p>Year</p>
            <input type="text" readonly="readonly" value="2018" name="year" class="input"/>
            
            <p>Time</p>
            <select name="Time">
                <option value="9am">9:00 am</option>
                <option value="10am">10:00 am</option>
                <option value="11am">11:00 am</option>
                <option value="12pm">12:00 pm</option>
                <option value="1pm">1:00 pm</option>
                <option value="2pm">2:00 pm</option>
                <option value="3pm">3:00 pm</option>
                <option value="4pm">4:00 pm</option>
                <option value="5pm">5:00 pm</option>
            </select>
            
            <p>Dentist</p>
            <select name="Dentist">
                <option value="D201">Frank Martin</option>
                <option value="D202">Susan Cassidy</option>
                <option value="D203">Jerry York</option>
                <option value="D204">Wayne Pattersen</option>
            </select>
            
            <p>Insurance</p>
            <select name="Insurance">
                <option value="Cigna">Cigna</option>
                <option value="Aetna">Aetna</option>
                <option value="Blue">Blue Cross</option>
            </select>
            
            <p>Procedure</p>
            <select name="Procedure">
                <option value="P114">Cleaning/Exam ($99.99)</option>
                <option value="P119">Xrays ($320)</option>
                <option value="P122">Whitening ($129.99)</option>
                <option value="P321">Cavity ($319.00)</option>
                <option value="P650">Top Dentures ($1950.00)</option>
                <option value="P660">Bottom Dentures ($1950.00)</option>
                <option value="P780">Crown ($795.00)</option>
                <option value="P790">Root Canal ($1019.00)</option>
            </select>
            <button class="form_button" type="submit">Submit</button>
        </form>
        </div>
    </body>
</html>
