import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String product1="Computer";
		String product2="Office desk";
		
		int age=30;
		int code = 5290;
		char gender ='F';
		
		double price1=2100.0;
		double price2=650.50;
		double measure = 53.234567;
	
		System.out.printf( product1 + ", which price is $ %.2f \n",  price1 );
		
		System.out.printf(product2 + ", which price is $ %.2f \n \n ", price2);
		
		System.out.printf("Record: "+age+"years old, code "+ code +" and gender: "+gender);
		
	}

}