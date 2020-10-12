package johnbryce;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class PolishingWorkshop {

	private String address;
	private int numOfEmployees;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumOfEmployees() {
		return numOfEmployees;
	}
	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	
	public void display() {
		System.out.println(" THE ADDRESS OF THE POLISHWORKSHOP IS: " + address);
		System.out.println(" THE NUMBER OF THE EMPLOYEES IS: " + numOfEmployees);
		System.out.println("--------------------------------------------------------");
		
	}
	
	
}
