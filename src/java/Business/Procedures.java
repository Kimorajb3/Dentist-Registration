
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/********************************************************************
 *	Java III - Procedures Business Object
 *      Kimora Bailey - Spring 2022
 *      Procedures.java
 ********************************************************************/

public class Procedures {
  private String proccode;
  private String prname;
  private String prdesc;
  double cost;
  
  public Procedures(){
      proccode = "";
      prname = "";
      prdesc = "";
      cost = 0.0;
  }
  
  public Procedures(String pc, String pn, String pd, double ct){
      proccode = pc;
      prname = pn;
      prdesc = pd;
      cost = ct;
  }
  
  public String getproccode(){
      return proccode;
  }
  
  public void setproccode(String pc){
      proccode = pc;
  }
  
  public String getprname(){
      return prname;
  }
  
  public void setprname(String pn){
      prname = pn;
  }
  
  public String getprdesc(){
      return prdesc;
  }
  
  public void setprdesc(String pd){
      prdesc = pd;
  }
  
  public double getcost(){
      return cost;
  }
  
  public void setcost(double ct){
      cost = ct;
  }
  
 /********************************************************************
 *  This method is to select data with the procCode
 ********************************************************************/
  public void selectDB(String pc){
    proccode = pc;
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/bellk/OneDrive/Desktop/DentistOfficeMDB.mdb");
            Statement stmt = con.createStatement();
            
            String sql = "Select * from Procedures WHERE procCode ='"+ getproccode() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            setprname(rs.getString(2));
            setprdesc(rs.getString(3));
            setcost(rs.getDouble(4));
            
            
        }
        catch(ClassNotFoundException | SQLException err){
            System.out.println("Error");
        }
        
   }
  public void display(){
    System.out.println("Procedure Code: " + getproccode());
    System.out.println("Procedure Name: " + getprname());
    System.out.println("Procedure Description: " + getprdesc());
    System.out.println("Cost: $" + getcost());
}
   
   public static void main(String args[]){
    Procedures P1 = new Procedures();
    P1.selectDB("P114");
    P1.display();
}
}
