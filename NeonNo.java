/*
 * Neon number defination :
 *                        if addition of square digits == that number it means is the neon number
 *                        
 *                        eg.  9 square == 81 then 8+1=9  then the number is neon
 * 
 *    write a program  to check the number is input by is that neon or not                    
 */                     
package WhileLoops;
import java.util.Scanner;
public class NeonNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nnumber");
		int no=sc.nextInt();
		
		int square= no*no;
		int sum=0;
		int digit=0;
		
		while(square>0) {
			digit=square % 10;
			sum=sum + digit;
			square= square/10;
		}if(sum == no) {
			System.out.println(no+" is neon number");
		}else {
			System.out.println(no+" is not neon number");
		}

	}

}
