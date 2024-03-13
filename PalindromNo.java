package WhileLoops;
/*
 * Defination of palindrom : 
 *                         if the no=121 the number is written by revevrse mode 
 *                         and the number is giving same output then the number 
 *                         is palinndrom
 *                         e.g 141=141  151=151
 *                       
 *  write a program to check the number is palindrom or not                       
 */
public class PalindromNo {

	public static void main(String[] args) {
		
		int no=121;
		
		int temp=no;
		int sum=0;
		int digit=0;
		
		while(no>0) {
			
			digit=no%10;
			sum=sum*10+digit;
			no=no/10;
			
		}if(sum==temp) {
			System.out.println(temp+" is palindrom");
		}else {
			System.out.println(temp+" is not palindrom number");
		}

	}
	}


/*
 * write a program to check palindrom which is input by user
 * 
 * import java.util.Scanner;
 *  class Palindrom{
 *  public static void main(String args []){
 *  Scanner sc=new Scanner(System.in);
 *  System.out.println("Enter the number");
 *  int no=sc.nextInt();
 *  int temp=no;
 *  int sum=0;
 *  int digit=0;
 *  
 *  while(no>0){
 *  
 *  digit=no%10;
 *  sum=sum*10+digit;
 *  no=no/10;
 *  }
 *  if(sum==temp){
 *  System.out.println(temp+" is palindrom number");
 *  }else{
 *  System.out.println(temp+" is not palindrom number")
 *  }
 *  }
 *  }
 *  
 * 
 */
