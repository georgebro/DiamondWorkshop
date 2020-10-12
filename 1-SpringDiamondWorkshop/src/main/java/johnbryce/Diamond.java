package johnbryce;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Diamond {

	private double carat;
	private String color;

	public Diamond(){
	}

	public Diamond(double carat, String color) {
		setCarat(carat);
		setColor(color);
	}

	public double getCarat() {
		return carat;
	}

	public void setCarat(double carat) {
		this.carat = carat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void display(){
		System.out.println(" THE COLOR OF THE DIAMON IS: "+color);
		System.out.println(" THE CARAT OF THE DIAMON IS: "+carat);
		System.out.println(" ************************************ ");
	}

	@Override
	public String toString() {
		return "Diamond [carat=" + carat + ", color=" + color + "]";
	}

//	public void getRandomDiamond( double carat, String color ) {
//		
//		
//	}

}
