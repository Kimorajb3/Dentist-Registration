
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/******************************************************************
 *      Java III - Appointments Business Object
 *      Kimora Bailey - Spring 2022
 *      Appointments.java
 *****************************************************************/
public class Appointments {
    private String ADT;
    private String patId;
    private String dentId;
    private String proccode;
    
    public Appointments(){
        ADT = "";
        patId = "";
        dentId = "";
        proccode = "";
    }
    
    public Appointments(String adt, String pID, String dID, String pc){
        ADT = adt;
        patId = pID;
        dentId = dID;
        proccode = pc;
    }
    
    public String getADT(){
        return ADT;
    }
    
    public void setADT(String adt){
        ADT = adt;
    }
    
    public String getpatId(){
        return patId;
    }
    
    public void setpatId(String pID){
        patId = pID;
    }
    
    public String getdentId(){
        return dentId;
    }
    
    public void setdentId(String dID){
        dentId = dID;
    }
    
    public String getproccode(){
        return proccode;
    }
    
    public void setproccode(String pc){
        proccode = pc;
    }
    
 /********************************************************************
 *	This method is to select from the appointment database using patient id
 ********************************************************************/
    public void selectDB(String pID){
    patId = pID;
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
            Statement stmt = con.createStatement();
            
            String sql = "Select * from Appointments WHERE patId ='"+ getpatId() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            setADT(rs.getString(1));
            setpatId(rs.getString(3));
            setdentId(rs.getString(4));
            setproccode(rs.getString(2));
            
            }
        catch(ClassNotFoundException | SQLException err){
            System.out.println("Error");
        }
 
   }
 /********************************************************************
 *	This method is to select from the appointment database using dentist id
 ********************************************************************/
    public void selectDBD(String dID){
    dentId = dID;
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
            Statement stmt = con.createStatement();
            
            String sql = "Select * from Appointments WHERE dentId ='"+ getdentId() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            setADT(rs.getString(1));
            setpatId(rs.getString(3));
            setdentId(rs.getString(4));
            setproccode(rs.getString(2));
            
            }
        catch(ClassNotFoundException | SQLException err){
            System.out.println("Error");
        }
        
   }
    
 /********************************************************************
 *	This method is to insert into appointments table
 ********************************************************************/
    public void insertDB(){
       
       try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
        Statement stmt = con.createStatement();
        
        String sql = "Insert into Appointments (apptDateTime, patId, dentId, procCode) "
                      + "values('"+getADT()+"','"+getpatId()+"','"+getdentId()+"','"+getproccode()+"')";
        System.out.println(sql);
        int n = stmt.executeUpdate(sql);
        if (n==1){
            System.out.println("INSERT SUCCESS");
        }
        else{
            System.out.println("INSERT UNSUCCESSFUL");
        }
        con.close();
        }
        catch(Exception err){
            System.out.println("Error");
        }
   }
 /********************************************************************
 *	This method is to update the appointments table
 ********************************************************************/
     public void updateDB(){
              
       try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
        Statement stmt = con.createStatement();
        
        String sql = "Update Appointments  Set patId ='"+getpatId()+"', dentId ='"+getdentId()+
                    "', procCode ='"+getproccode()+
                    "' where apptDateTime = '"+getADT()+"'";
        System.out.println(sql);
        int n = stmt.executeUpdate(sql);
        if (n==1){
            System.out.println("UPDATE SUCCESS");
        }
        else{
            System.out.println("UPDATE UNSUCCESSFUL");
        }
        con.close();
        }
        catch(ClassNotFoundException | SQLException err){
            System.out.println("Error");
        }
   }

 /********************************************************************
 *	This method is to delete from the appointments table
 ********************************************************************/
public void deleteDB(){
       try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
        Statement stmt = con.createStatement();
        
        String sql = "Delete from Appointments WHERE patId ='"+ getpatId() + "'";
        System.out.println(sql);
        int n = stmt.executeUpdate(sql);
        if (n==1){
            System.out.println("DELETE SUCCESS");
        }
        else{
            System.out.println("DELETE UNSUCCESSFUL");
        }
        con.close();
        }
        catch(Exception err){
            System.out.println("Error");
        }
   }     
   
   public void display(){
    System.out.println("Appointment Date Time: " + getADT());
    System.out.println("Patient ID: " + getpatId());
    System.out.println("Dentist ID: " + getdentId());
    System.out.println("Proc Code: " + getproccode());
}
   
   public static void main(String args[]){
    Appointments a1= new Appointments();
    a1.selectDB("A911");
    a1.deleteDB();
    a1.display();
}

}
