package johnbryce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class program {

	//Generate random number .
	public static int getRandomNumber(int min,int max) {
		return (int)(Math.random()*(max-min)+min);
	}
	
	//Generate random color.
	public static String getColor() {
		String str[] = new String[] {"White","Black","Red","Green","Blue"};
		int randomNumber = getRandomNumber(0,4);
		return str[randomNumber]; 
		
	}
	
	// Create Diamonds(objects) ArrayList.
	public static List<Diamond> initialArray(int size , int min ,int max){
		List<Diamond> diamonds = new ArrayList<Diamond>();
		for (int i = 0; i < size; i++) {
			diamonds.add(new Diamond(getRandomNumber(min, max),getColor()));
		}
		return diamonds;
	}
	
		public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);

		PolishingWorkshop pw = new PolishingWorkshop();
		pw.display();
		
		Globals g = (Globals) context.getBean("globals");
		g.display();
		
		
		int size = g.getNumOfDiamonds();
		List<Diamond> diamondsArray = initialArray(size, 0, 20);
		
		for (Diamond integer : diamondsArray ) {
			System.out.println("*"+integer);
		}
		System.out.println();
	
		
		context.close();
	}
}

