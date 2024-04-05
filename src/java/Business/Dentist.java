package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/********************************************************************
 *      Java III - Dentist Business Object
 *      Kimora Bailey - Spring 2022
 *      Dentist.java
 ********************************************************************/
public class Dentist {
    private String id;
    private String passwd;
    private String firstName;
    private String lastName;
    private String email;
    private int office;
    public ApptList apptList = new ApptList();
    
    public Dentist(){
        id = "";
        passwd = "";
        firstName = "";
        lastName = "";
        email = "";
        office = 0;             
    }
    
    public Dentist(String ID, String pass, String fn, String ln, String em, int off){
        id = ID;
        passwd = pass;
        firstName = fn;
        lastName = ln;
        email = em;
        office = off;
    }
    
    public String getid(){
        return id;
    }
    
    public void setid(String ID){
        id = ID;
    }
    
    public String getpasswd(){
        return passwd;
    }
    
    public void setpasswd(String pass){
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
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String em){
        email = em;
    }
    
    public int getoffice(){
        return office;
    }
    
    public void setoffice(int off){
        office = off;
    }
 
 /********************************************************************
 *	This method is to select information from the dentist table
 ********************************************************************/
    public void selectDB(String ID){
    id = ID;
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
            Statement stmt = con.createStatement();
            
            String sql = "Select * from Dentists WHERE id ='"+ getid() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            setpasswd(rs.getString(5));
            setfirstName(rs.getString(1));
            setlastName(rs.getString(2));
            setemail(rs.getString(3));
            setoffice(rs.getInt(6));
            getAppointments();
            con.close();
        }
        catch(ClassNotFoundException | SQLException err){
            System.out.println("Error");
        }
        
        
   }
   
 /********************************************************************
 *	This method is to update the dentist information
 ********************************************************************/
     public void updateDB(){
              
       try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
        Statement stmt = con.createStatement();
        
        String sql = "Update Dentists  Set passwd ='"+getpasswd()+"', firstName ='"+getfirstName()+
                    "', lastName ='"+getlastName()+"', email ='"+getemail()+ "', office ='"+getoffice()+
                    "' where id = '"+getid()+"'";
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
 *      This method will list the appointments based on the dentist id
 ********************************************************************/
   public void getAppointments(){
      try{
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
           Statement stmt = con.createStatement();
        
           String sql = "Select patId from Appointments WHERE dentId ='"+ getid() + "'";
           System.out.println(sql);
           ResultSet rs = stmt.executeQuery(sql);
           Appointments a1;
           String pID;
            
           while(rs.next()){
              pID = rs.getString(1);
              System.out.println("Patient ID: "+pID);
              a1 = new Appointments();
              a1.selectDB(pID);
              apptList.addAppoints(a1);
           }
           con.close();
       }
       catch(Exception e){
           System.out.println("ERROR");
       } 
   }
        
   
   public void display(){
    System.out.println("Dentist ID: " + getid());
    System.out.println("Dentist Password: " + getpasswd());
    System.out.println("Dentist First Name: " + getfirstName());
    System.out.println("Dentist Last Name: " + getlastName());
    System.out.println("Dentist Email: " + getemail());
    System.out.println("Office: " + getoffice());
    apptList.displayList();
}
   
   public static void main(String args[]){
    Dentist d1= new Dentist();
    d1.selectDB("D201");
    d1.display();
}
}
