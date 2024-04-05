package Business;
/********************************************************************
 *      Java III - AppointmentList Business Object
 *      Kimora Bailey - Spring 2022
 *      ApptList.java
 *******************************************************************/

public class ApptList {
 /********************************************************************
 *      List of appointments array
 ********************************************************************/
    public int count = 0;  
    public Appointments apptList[] = new Appointments[10]; 
    
/********************************************************************
 *      This method is used to add the appointments to the list
 ********************************************************************/    
public void addAppoints(Appointments a1){
    apptList[count] = a1;
    count++;
}

/********************************************************************
 *      Display method
 ********************************************************************/
public void displayList() {
	for (int x=0; x<count; x++) {
		apptList[x].display(); 
	} 
}

public static void main(String args[]) { 

	ApptList apptList = new ApptList();

	Appointments a = new Appointments("April 1, 2021, 10am", "P543", "A302", "D420");
	

	apptList.addAppoints(a);

	apptList.displayList();

}
}