package B31;
import java.util.Scanner;
public class MetroCityApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city name");
		String city=sc.next();
		if(city.equalsIgnoreCase("pune")) {
			System.out.println(city+" is a metro city");
		}else if(city.equalsIgnoreCase("mumbai")) {
			System.out.println(city+" is a metro city");
		}else if (city.equalsIgnoreCase("nashik")) {
			System.out.println(city+" is a metro city");
		}else if(city.equalsIgnoreCase("nagpur")) {
			System.out.println(city+" is a metro city");
		}else {
			System.out.println(city+" is a non metro city");
		}
	}
}