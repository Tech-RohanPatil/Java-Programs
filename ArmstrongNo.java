/*
 *  armstrong number defination:
 *                              addition of cubes of each digit is equal to that particular number 
 *                              then the number is armstrong number.
 *                              
 *                              e.g  153= cubes of 1+5+3= 1+125+27= 153
 *                                              
 *                                         
 *                                             
 *                               
 *  
 */
package WhileLoops;

import java.util.Scanner;
public class ArmstrongNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		
		int temp=no;
		int sum=0;
		int digit=0;
		
		while(no>0) {
			 digit=no%10;
			 sum=sum+digit*digit*digit;
			 no=no/10;
			 
		}if(sum==temp ) {
			System.out.println(temp+" is armstrong number");
		}else {
			System.out.println(temp+" is  not armstrong number");
		}
		

	}

}
