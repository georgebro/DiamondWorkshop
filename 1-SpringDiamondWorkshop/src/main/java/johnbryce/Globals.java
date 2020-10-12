package johnbryce;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Globals {

	private String serverAddress;
	private int numOfDiamonds;
	
	
	public String getServerAddress() {
		return serverAddress;
	}
	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}
	public int getNumOfDiamonds() {
		return numOfDiamonds;
	}
	public void setNumOfDiamonds(int numOfDiamonds) {
		this.numOfDiamonds = numOfDiamonds;
	}
	
	public void display() {
		System.out.println( " THE SERVER ADDRESS IS: " + serverAddress);
		System.out.println( " THE NUMBER OF DIAMONDS IS: " + numOfDiamonds);
		System.out.println( " --------------------------------------------- ");
	}
	
}
