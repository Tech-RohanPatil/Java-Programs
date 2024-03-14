/*
 *  Perfect number defination :
 *                            if additon of factors is == that number it means the nnumber is perfect number
 *                            
 *                            eg. 6 factors of 6 = 1,2,3  1+2+3 ==6 then the number is perfect number
 *   
 *  write a program to check the number is perfect number or not.                          
 */ 
package WhileLoops;
import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		 int sum=0;
		
		for(int i=1; i<=no/2; i++) {
			if(no%i==0) {
				sum=sum+i;			
		}
	}if(sum == no) {
		System.out.println(no+" is perfect number");
	}else {
		System.out.println(no+" is not perfect number");
	}

}
}
