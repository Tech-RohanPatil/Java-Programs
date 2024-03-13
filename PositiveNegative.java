package B31;
import java.util.Scanner;

public class PositiveNegative{

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int no=sc.nextInt();
       
       if(no>0) {
    	   System.out.println(no+" is a positive number");
       }else if(no<0){
    	   System.out.println(no+" is a negative number");
       } else {
    	   System.out.println(no+" is unsigned number");
       }
	}

}
