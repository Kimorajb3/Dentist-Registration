package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/********************************************************************
 *	Java III - Patient Business Object
 *      Kimora Bailey - Spring 2022
 *      Patient.java
 ********************************************************************/

public class Patient {
    private String patId;
    private int passwd;
    private String firstName;
    private String lastName;
    private String addr;
    private String email;
    private String insCo;
    
    public Patient(){
        patId = "";
        passwd = 0;
        firstName = "";
        lastName = "";
        addr = "";
        email = "";
        insCo = "";
    }
    
    public Patient (String Patid, int pass, String fn, String ln, String ad, String em, String Insco){
        patId = Patid;
        passwd = pass;
        firstName = fn;
        lastName = ln;
        addr = ad;
        email = em;
        insCo = Insco;
    }
    
    public String getpatId(){
        return patId;
    }
    
    public void setpatId(String Patid){
        patId = Patid;
    }
    
    public int getpasswd(){
      return passwd;  
    }
    
    public void setpasswd(int pass){
        passwd = pass;
    }
    
    public String getfirstName(){
        return firstName;
    }
    
    public void setfirstName(String fn){
        firstName = fn;
    }
    
    public String getlastName(){
        return lastName;
    }
    
    public void setlastName(String ln){
        lastName = ln;
    }
    
    public String getaddr(){
        return addr;
    }
    
    public void setaddr(String ad){
        addr = ad;
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String em){
        email = em;
    }
    
    public String getinsCo(){
        return insCo;
    }
    
    public void setinsCo(String Insco){
        insCo = Insco;
    }
 /********************************************************************
 *	This method is to select information from the patient table
 ********************************************************************/
     public void selectDB(String Patid){
    patId = Patid;
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
            Statement stmt = con.createStatement();
            
            String sql = "Select * from Patients WHERE patId ='"+ getpatId() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            setpasswd(rs.getInt(7));
            setfirstName(rs.getString(1));
            setlastName(rs.getString(2));
            setaddr(rs.getString(3));
            setemail(rs.getString(4));
            setinsCo(rs.getString(5));
            
        }
        catch(ClassNotFoundException | SQLException err){
            System.out.println("Error");
        }
        
   }
 /********************************************************************
 *	This method is to update information from the patient table
 ********************************************************************/
     public void updateDB(){
              
       try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
        Statement stmt = con.createStatement();
        
        String sql = "Update Patients  Set passwd ='"+getpasswd()+"', firstName ='"+getfirstName()+
                    "', lastName ='"+getlastName()+"', addr ='"+getaddr()+"', email ='"+getemail()+"', insCo ='"+getinsCo()+
                    "' where patId = '"+getpatId()+"'";
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
        
   
   public void display(){
    System.out.println("Patient ID: " + getpatId());
    System.out.println("Patient Password: " + getpasswd());
    System.out.println("Patient First Name: " + getfirstName());
    System.out.println("Patient Last Name: " + getlastName());
    System.out.println("Patient Address: " + getaddr());
    System.out.println("Patient Email: " + getemail());
    System.out.println("Insurance: " + getinsCo());
}
   
   public static void main(String args[]){
    Patient p1= new Patient();
    p1.selectDB("A910");
    p1.setpasswd(5826);
    p1.updateDB();
    p1.display();
}
    }
    
